package Paskaitos.ZmogusPackage;

import Paskaitos.ZmogusPackage.d2.Utilities;

public class Main { //jei nenurodau public, klase galiu naudoti tik is einamojo katalogo
    //private - pasiekiami tik is ju klases
    //protected - tik tame package, taip pat is dukteriniu klasiu
    public static void main(String[] args) {

        Zmogus z;
        z = new Zmogus(); // kintamasis turi adresa i atminties vieta, kur sedi zmogus
        z.pavarde = "Jonaitis";
        z.vardas = "Jurgis";

        Zmogus z2 = z;
        System.out.println(z2.vardas);

        z2.vardas = "Petras";
        System.out.println(z.vardas);

        Zmogus z3 = new Zmogus("Ona", "Jone");
        System.out.println(z3.vardas + " " + z3.pavarde);

        System.out.println("z3 " + Utilities.KasYraKas(z3));

//        Zmogus[] zmones = new Zmogus[2];
//        zmones[0] = z2;
//        zmones[1] = z3;   arba:


        System.out.println("spausdinam masyvus");
        Zmogus[] zmones = {z2, z3, new Zmogus("Henrikas XVI")};
        String[] vardai = {"Antanas", "Birute", "Maryte"};

        for(String vardas : vardai){
            System.out.println(vardas);
        }
        System.out.println("spausdinam zmoniu masyva"); // reikia pasakyti, kad spausdinam varda arba pavarde, nes objekto
        //java spausdinti nemoka, nes nezino, kiek ir kokiu lauku mes turesim jame

//        for(Zmogus zmogus : zmones){
//            System.out.println(zmogus.vardas +
//                    (zmogus.pavarde == null ? " " : (" " + zmogus.pavarde)));
//        }

        for(Zmogus zmogus : zmones){
            Utilities.spausdintiZmogu(zmogus);
        }

        Mokinys m1 = new Mokinys("Antanukas", "Bumbuliukas", 1, null);
        m1.vardas = "Antanukas";
        m1.pavarde = "Bumbuliukas";
        m1.klase = 1;
        Utilities.spausdintiZmogu(m1);
        System.out.println("m1 " + Utilities.KasYraKas(m1));
        System.out.println();

        Mokinys m3 = new Mokinys("Petras", "Petraitis");

//        Mokinys m2 = new Mokinys(null, null, 0, null);
//        System.out.println("zmogus su tusciu vardu sekmingas");

//        Zmogus zy2 = new Zmogus("", null);
//        System.out.println("zmogus su tusciu vardu sekmingas");
//
//        Zmogus zy = new Zmogus(null);
//        System.out.println("zy sekmingas");
//
//
//
//        Zmogus zx = new Zmogus(null, null);
//        System.out.println("zx sekmingas");


//        double[] x = {100, 0};
//        System.out.println(x[2]);
//
        System.out.println("the end");
    }

}
