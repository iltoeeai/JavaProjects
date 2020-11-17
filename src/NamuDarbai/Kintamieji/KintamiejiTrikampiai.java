package NamuDarbai.Kintamieji;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class KintamiejiTrikampiai {
    public static void main(String[] args) {

        System.out.println("TRIKAMPIAI");

        System.out.print("Iveskite krastines a ilgi:");

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        System.out.print("Iveskite krastines b ilgi:");
        double b = scanner.nextDouble();

        System.out.print("Iveskite krastines c ilgi:");
        double c = scanner.nextDouble();

        double pusperimetris = ((a + b + c) / 2);
        double p = ((pusperimetris * (pusperimetris - a) * (pusperimetris - b) * (pusperimetris - c)));
        double pl = Math.sqrt(p);
        int plotas = (int) Math.floor(pl);

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ne trikampis.");
        } else if (a == b && b == c && a == c) {
            System.out.println("Lygiakrastis trikampis, kurio plotas = " + plotas);
        } else if (a == b || b == c || a == c) {
            System.out.println("Lygiasonis trikampis, kurio plotas = " + plotas);

        } else if (!(a == b && b == c && a == c) || !(a == b && b == c && a == c)) {
            System.out.println("Ivairiakrastis trikampis, kurio plotas = " + plotas);
        }

        if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
            System.out.println("Status trikampis, kurio plotas = " + plotas);
            if (a == b || b == c || a == c) {
                System.out.println("Status Lygiasonis trikampis, kurio plotas = " + plotas);
            }
            if (!(a == b && b == c && a == c) || !(a == b && b == c && a == c)) {
                System.out.println("Status Ivairiakrastis trikampis, kurio plotas = " + plotas);
            }
        }
    }
}
