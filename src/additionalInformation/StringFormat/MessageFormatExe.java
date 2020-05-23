package additionalInformation.StringFormat;

import java.text.MessageFormat;
import java.util.Date;

public class MessageFormatExe {
    public static void main(String[] args) {
        int fileCount = 1273;
        String diskName = "MyDisk";
        Object[] testArgs = {fileCount, diskName};
        MessageFormat form = new MessageFormat("The disk \"{1}\" contains {0} file(s).");
        System.out.println(form.format(testArgs)); // The disk "MyDisk" contains 1 273 file(s).

        int planet = 7;
        String event = "a disturbance in the Force";
        String result = MessageFormat.format(
                "At {0, time, medium} on {0, date} there was {1} on planet {2, number, integer}.", new Date(), event, planet);
        System.out.println(result);

    }


}
