package Paskaitos.TurnyrasUzdavinys;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Arrays;

public class TurnyrasUzdavinys {
    public static void main(String[] args) {

        if(args.length != 1 && args.length != 2){
            System.err.println("Nenurodyti dalyviu ir lenteles failai");
            return;
        }
        InputStream is;
        try{
            is = new FileInputStream(args[0]);
        } catch (FileNotFoundException e){
            System.err.println("Nerastas dalyviu failas");
            return;
        }

        OutputStream os;
        if(args.length == 0){
            try{
                os = new FileOutputStream(args[1]);
            } catch (FileNotFoundException e){
                System.err.println("Klaida kuriant lenteles faila");
                return;
            }
        }else {
            os = System.out;
        }

        Turnyras turnyras = new Turnyras(is, os);
        turnyras.execute();

        System.out.println("Pabaiga");



//        System.out.println(Arrays.asList(args));

//        String dalyviai = args[0];
//        String lentele = args[1];

    }
}
