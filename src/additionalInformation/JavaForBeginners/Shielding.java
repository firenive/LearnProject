package additionalInformation.JavaForBeginners;

import java.text.MessageFormat;

public class Shielding {
    public static void main(String[] args) {
        String pattern = "{0} doesn''t show values ( {1}, {2}, {3}, {4} )";
        final Object[] argus = { "Testpattern", 100, 200, 300, 400 };
        System.out.println(MessageFormat.format(pattern, argus));
        pattern = pattern.replaceAll("(?<!')'(?!')", "''");
        System.out.println("Replaced singlequotes: " + MessageFormat.format(pattern, argus));
    }
}
