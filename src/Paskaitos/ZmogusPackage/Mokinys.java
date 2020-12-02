package Paskaitos.ZmogusPackage;

public class Mokinys extends Zmogus { //kiekvienas mokinio objektas yra ir zmogaus klases objektas

//    String vardas;   situ nereikia, nes mokinys automatiskai paveldi varda ir pavarde
//    String pavarde;
    public int klase;
    public int[] trimestras;

    Mokinys(String vardas, String pavarde, int klase, int[] trimestras){
//        this.vardas = vardas;
        super(vardas); // super = tevine klase arba senelio klase. jei is vaikines klases norim klviest tevines klases konstruktoriu
        this.pavarde = pavarde;
        this. klase = klase;
        this. trimestras = trimestras;
    }

    Mokinys(String vardas, String pavarde){
        this.vardas = vardas;
        this.pavarde = pavarde;
    }
}
