package Myrusakov.Chapter9_MultiThread.Lesson3_WorkThread.Exe;

import java.io.*;

public class ObjectFile  {
    File file;
    public ObjectFile(File file) {
        this.file = file;

    }
    public void writeFile (String s) throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
        bf.write(s);
        bf.close();
    }
    public String readFile () throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
        String line;
        String result = " ";
        while ((line = br.readLine()) != null) {
            result += line;
        }
        br.close();
        return result;

    }


}
