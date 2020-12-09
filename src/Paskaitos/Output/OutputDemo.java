package Paskaitos.Output;

import java.io.*;

public class OutputDemo {
    public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream("a.txt");
            OutputStream os = new FileOutputStream("b.txt");

            int c = is.read();
            while(c!= -1){
                os.write(c);
                c=is.read();
            }
        } catch (IOException e){
          e.printStackTrace();
        }
    }
}
