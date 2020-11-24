package CSVReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import static java.time.chrono.JapaneseEra.values;

public class CSVReader {
    public static void main(String[] args) {
        String path = "C:\\Users\\tadas\\Desktop\\JAVA\\src\\CSVReader\\nba_ht_wt.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));



            while ((line = br.readLine()) != null) {
//                System.out.println(line);
                String[] values = line.split(",");

                System.out.println("Player: " + values[0] + ", Age: " + values[4]); // values [2] prints columns
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
