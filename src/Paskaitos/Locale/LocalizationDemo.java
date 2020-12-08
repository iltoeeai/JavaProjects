package Paskaitos.Locale;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class LocalizationDemo {
    public static void main(String[] args) throws IOException {
        // System.out.println("Labas rytas");
        Properties properties = new Properties();
        String fileName = "src" + File.separator +
                "Paskaitos/Locale" + File.separator +
                "app-config.properties";
        System.out.println("File name: " + fileName);

        properties.load(new FileInputStream(fileName)); //vietoj / galima rasyt File.seperator

        System.out.println(properties);

        String loop = properties.getProperty("loop");

        int loopCnt = Integer.parseInt(loop);

        for(int i = 0; i< loopCnt; i++){
            System.out.println(properties.getProperty("app-name"));
        }

        // Dezeje yra 3 obuoliai - Dezeje yra {3} {obuoliai}
        // There are 3 apples in the box - There are {3} {apples} in the box

        String what = "apples";
        int amount = 3;

        Locale.setDefault(Locale.US);
        printMessage(what, amount);
        printMessage("stones", 10);

        Locale.setDefault(Locale.forLanguageTag("lt"));
        printMessage(what, amount);
        printMessage("stones", 10);

    }

    static void printMessage(String what, int amount){
        //String enTemplate = "There are {1} {0} in the box"; //sablonas
        //MessageFormat.format(enTemplate, what, amount);
        ResourceBundle bundle = ResourceBundle.getBundle("Paskaitos.Locale.messages");
        String enTemplate = bundle.getString("box");
        System.out.println(MessageFormat.format(enTemplate, what, amount));

    }
}
