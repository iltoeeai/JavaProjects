package Paskaitos.ZmogusPackage.d2;

import Paskaitos.ZmogusPackage.Mokinys;
import Paskaitos.ZmogusPackage.Zmogus;

public class Utilities {

    public static void spausdintiZmogu(Zmogus z){ //norint is vieno metodo kviesti kita metoda, jis irgi turi buti statinis

        System.out.println("---------------------");
        System.out.println("vardas: " + z.vardas);
        System.out.println("pavarde: " +
                (z.pavarde == null ? " - be pavardes" : z.pavarde));
        System.out.println("---------------------");

    }

    public static String KasYraKas(Object x){ // Object reiskia kad duomenu tipas gali buti bet kas
        String kas = "";
        if (x instanceof Zmogus){
            kas = " yra Zmogus";
        } else{
            kas = " nera Zmogus";
        }
        if (x instanceof Mokinys){
            kas = " yra Mokinys";
        } else{
            kas = " nera Mokinys";
        }
        return kas;
    }
}
