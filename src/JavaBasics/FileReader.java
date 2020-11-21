package JavaBasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/tadas/Desktop/captmidn.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "";
        while (scan.hasNextLine()) {                //reads/scans all the text
            System.out.println(scan.nextLine());
        }
        while (scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine()+ "\n");
        }

        FileWriter writer = new FileWriter("/Users/tadas/Desktop/newFile.txt");
        writer.write(fileContent);
        writer.close();
    }
}
