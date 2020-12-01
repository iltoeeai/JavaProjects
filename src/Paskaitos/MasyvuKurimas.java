package Paskaitos;

public class MasyvuKurimas {
    public static void main(String[] args) {
        String[] miestai = {"Kaunas", "Babtai"};
        System.out.println(miestai[1]);

        String[] miestai2;

        int miestuSkaicius = 3;

        miestai2 = new String[miestuSkaicius];
        System.out.println(miestai2[0]); //null nes nera miesto

        miestai2[0] = "Balbieriskis";
        if (miestai2[0] == null){
            System.out.println("Nera miesto");
        } else {
            System.out.println(miestai2[0]); //jau ismes Balbieriski
        }

    }
}
