package Paskaitos.ZmogusPackage;

// Object -> Zmogus -> Mokinys(subklase)  -> Studentas
// Zmogus z = new Mokinys();  -- galima naudot tik tuos metodus, aprasytus zmoguje.
// z.pavarde = "Xxx"
// z.klase = 3;   - negalima, nes zmoguje klase nera aprasyta
// Mokinys m = (Mokinys)z;
// Zmogus z2 = new Studentas("Jonas", "Marija");
// Object o = z;

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

    class Studentas extends Mokinys {

        public Studentas(String vardas, String pavarde) {
            super(vardas, pavarde);
        }
    }
}
