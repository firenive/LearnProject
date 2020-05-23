package additionalInformation.StringFormat;

import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.util.Date;

public class MessagePlatform {
    public static void main(String[] args) {
        MessageFormat pattForm = new MessageFormat("There {0} on {1}. \n {2} {2}");
        int count = 1;
        Date date = new Date();
        Object[] testArgs = {count, "ADisk", date, date};

        double[] fileLimits = {0, 1, 2};
        String[] filePart = {"are no files", "is one file", "are {0} files"};
        ChoiceFormat fileForm = new ChoiceFormat(fileLimits, filePart);

        Format[] testFormats = {fileForm, null, DateFormat.getDateInstance(DateFormat.SHORT),
                DateFormat.getTimeInstance(DateFormat.SHORT)};
        pattForm.setFormats(testFormats);

        System.out.println(pattForm.format(testArgs));
    }
}
