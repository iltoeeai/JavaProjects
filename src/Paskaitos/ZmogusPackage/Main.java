package Paskaitos.ZmogusPackage;

public class Main {
    public static void main(String[] args) {

        Zmogus z;
        z = new Zmogus(); // kintamasis turi adresa i atminties vieta, kur sedi zmogus
        z.pavarde = "Jonaitis";
        z.vardas = "Jurgis";

        Zmogus z2 = z;
        System.out.println(z2.vardas);

        z2.vardas = "Petras";
        System.out.println(z.vardas);
    }
}
