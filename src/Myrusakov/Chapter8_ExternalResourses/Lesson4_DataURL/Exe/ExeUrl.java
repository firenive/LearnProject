package Myrusakov.Chapter8_ExternalResourses.Lesson4_DataURL.Exe;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ExeUrl extends JFrame implements ActionListener, FocusListener {
    private JTextField enterTheURLTextField;
    private JPanel mainPanel;
    private JButton showCodeButton;
    private JTextArea textArea1;
    private JButton saveToFileButton;
    private final String field = "Enter the URL";
    private URL url;
    private String titleURL;

    public static void main(String[] args) {
        new ExeUrl();
    }

    // https://myrusakov.ru/
    public ExeUrl() {
        super("My program");

        setBounds(300, 300, 1024, 768);
        //  setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(mainPanel);
        textArea1.setLineWrap(true);
        requestFocus();
        setVisible(true);
        // pane.setColumnHeaderView(textArea1);

        enterTheURLTextField.addFocusListener(this);
        showCodeButton.addActionListener(this);
        saveToFileButton.addActionListener(this);
    }

    public String getTitleURL() throws MalformedURLException {
        getUrl();
        titleURL = enterTheURLTextField.getText().substring(8);
        titleURL = titleURL.substring(0, titleURL.indexOf("/"));
        System.out.println(titleURL);
        return titleURL;
    }

    public URL getUrl() throws MalformedURLException {
        url = new URL(enterTheURLTextField.getText().trim());
        return url;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals(showCodeButton.getText())) {
            try {
                url = getUrl();
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                StringBuilder result = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line).append("\r\n");
                }
                textArea1.setText(result.toString());
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (ae.getActionCommand().equals(saveToFileButton.getText())) {
            String text = textArea1.getText();
            JFileChooser chooser = new JFileChooser();

            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            try {
                titleURL = getTitleURL();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            int r = chooser.showOpenDialog(mainPanel);
            if (r == JFileChooser.APPROVE_OPTION) {
                File directory = chooser.getSelectedFile();
                String path = directory.getAbsolutePath() + "\\" + titleURL + ".txt";

                File textFile = new File(path);
                try {
                    textFile.createNewFile();
                    BufferedWriter writer = new BufferedWriter(new FileWriter(path));
                    writer.write(text);
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public void focusGained(FocusEvent e) {

        if (enterTheURLTextField.getText().equals(field)) {
            enterTheURLTextField.setText("");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (enterTheURLTextField.getText().equals("")) {
            enterTheURLTextField.setText(field);
        }
    }


}
