package Paskaitos.Output;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLArYraLietuva {
    public static void main(String[] args) {
        System.out.println("Testas LT: ĄČĘĖĮŠŲ");

        try {
            URL url = new URL ("https://lt.wikipedia.org/wiki/Lietuva");
            InputStream is = url.openStream();
            InputStreamReader reader = new InputStreamReader(is);
            int c;

            while((c= reader.read()) != -1){
                System.out.print((char) c);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
