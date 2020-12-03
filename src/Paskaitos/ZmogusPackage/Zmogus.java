package Paskaitos.ZmogusPackage;

public class Zmogus {

    public String vardas; // klases laukai arba atributai
    public String pavarde; //darom public, kad prieitume is Utilities

    Zmogus(){ //default konstruktorius, kuris net nera aprasytas
        //mes ji apsirasem, nes nerastu sito defaultinio konstruktoriaus

        System.out.println("kvieciamas default konstruktorius");
    }

    public Zmogus(String vardas, String pavarde){
//        if(vardas==null){
//            //klaida
////            System.err.println("Nenurodytas vardas");
//            throw new RuntimeException("Nenurodytas vardas"); //ismesti exceptiona
//
//        } else{
//        this.vardas = vardas; //ne bet kokiam kintamajam ar parametrui, o klases laukui - this
//        this.pavarde = pavarde;
//        }
        // su skliausteliais rasom, nes reiskia, jog naudoju is sito konstruktoriaus kita konstruktoriu:
        patikrintiVarda(vardas);
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    Zmogus(String vardas){
//        if(vardas==null || vardas.length() == 0){
//            //klaida
////            System.err.println("Nenurodytas vardas");
//            throw new RuntimeException("Nenurodytas vardas"); //ismesti exceptiona
//
//        } else{
//        this.vardas = vardas;
//        }
        patikrintiVarda(vardas);
        this.vardas = vardas;
    }


    void patikrintiVarda(String vardas) {
        if (vardas == null || vardas.length() == 0) {
            //klaida
//            System.err.println("Nenurodytas vardas");
            throw new RuntimeException("Nenurodytas vardas"); //ismesti exceptiona
        }
    }
    
}
