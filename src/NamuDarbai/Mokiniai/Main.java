package NamuDarbai.Mokiniai;

public class Main {

    static int mokiniuSkaicius = 5;
    static Mokinys[] mokiniai = new Mokinys[mokiniuSkaicius];

    public static void main(String[] args) {
        ivestiPradiniusDuomenis();
        print("Pradiniai duomenys: ");

        pagalKlase();
        print("Sulygiuota pagal klase: ");

        pagalVarda();
        print("Sulygiuota pagal varda: ");

        pagalKlasePavardeVarda();
        print("Sulygiuota pagal klase, pavarde, varda: ");

    }

    static void ivestiPradiniusDuomenis(){

        Mokinys mokinys1 = new Mokinys();
        mokinys1.klase = 1;
        mokinys1.vardas = "Ona";
        mokinys1.pavarde = "Onaityte";
        mokiniai[0] = mokinys1;

        Mokinys mokinys2 = new Mokinys();
        mokinys2.klase = 2;
        mokinys2.vardas = "Jonas";
        mokinys2.pavarde = "Jonaitis";
        mokiniai[1] = mokinys2;

        Mokinys mokinys3 = new Mokinys();
        mokinys3.klase = 2;
        mokinys3.vardas = "Antanas";
        mokinys3.pavarde = "Antanaitis";
        mokiniai[2] = mokinys3;

        Mokinys mokinys4 = new Mokinys();
        mokinys4.klase = 1;
        mokinys4.vardas = "Jonas";
        mokinys4.pavarde = "Jonaitis";
        mokiniai[3] = mokinys4;

        Mokinys mokinys5 = new Mokinys();
        mokinys5.klase = 1;
        mokinys5.vardas = "Petras";
        mokinys5.pavarde = "Petraitis";
        mokiniai[4] = mokinys5;
    }

    //spausdina viena mokini
    static void print (int indeksas){
        System.out.println(mokiniai[indeksas].klase + " " + mokiniai[indeksas].vardas + " "
                                                            + mokiniai[indeksas].pavarde + " ");
    }

    //spausdina visus mokinius
    static void print(String title){
        System.out.print("\n");
        System.out.println(title);
        for(int i = 0; i < mokiniai.length; i++){
            print(i);
        }
    }

    // 0. isrinkti maziausia klase nuo 0 iki 5 ir padeti i 0 pozicija
    // 1. isrinkti nuo 1 iki 5 maziausia klase ir padeti i 1 pozicija
    // n. isrinkti nuo n iki 5 maziausia klase ir padeti i n pozicija

    static void pagalKlase(){
        for (int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++){
            for (int i = zingsnis; i < mokiniai.length; i++){
                if (mokiniai[i].klase < mokiniai[zingsnis].klase){
                    //mokiniai[i] <-> mokiniai[zingsnis]
                    Mokinys mokinys = mokiniai[i];
                    mokiniai[i] = mokiniai [zingsnis];
                    mokiniai[zingsnis] = mokinys;
                }
            }
        }
    }
    static void pagalVarda(){
        for (int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++){
            for (int i = zingsnis; i < mokiniai.length; i++){
                if (mokiniai[i].vardas.compareTo(mokiniai[zingsnis].vardas) < 0){
                    //mokiniai[i] <-> mokiniai[zingsnis]
                    Mokinys mokinys = mokiniai[i];
                    mokiniai[i] = mokiniai [zingsnis];
                    mokiniai[zingsnis] = mokinys;
                }
            }
        }
    }
    static void pagalKlasePavardeVarda(){

        for (int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++){

            for (int i = zingsnis; i < mokiniai.length; i++){

                if (mokiniai[i].klase < mokiniai[zingsnis].klase) {
                    Mokinys mokinys = mokiniai[i];
                    mokiniai[i] = mokiniai[zingsnis];
                    mokiniai[zingsnis] = mokinys;
                } else if (mokiniai[i].klase == mokiniai[zingsnis].klase){
                    if (mokiniai[i].pavarde.compareTo(mokiniai[zingsnis].pavarde) < 0){
                        Mokinys mokinys = mokiniai[i];
                        mokiniai[i] = mokiniai[zingsnis];
                        mokiniai[zingsnis] = mokinys;
                    } else if (mokiniai[i].pavarde.compareTo(mokiniai[zingsnis].pavarde) == 0){
                        if (mokiniai[i].vardas.compareTo(mokiniai[zingsnis].vardas) < 0){
                            Mokinys mokinys = mokiniai[i];
                            mokiniai[i] = mokiniai[zingsnis];
                            mokiniai[zingsnis] = mokinys;
                        }
                    }
                }
            }
        }
    }
}