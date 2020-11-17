package NamuDarbai.Ciklai;

import java.util.Scanner;

public class DoubleApvalinimas {
    public static void main(String[] args) {
        double skaicius = 12.1234567890;

        System.out.println("Skaiciai po kablelio apvalinant: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.printf("Suapvalintas skaicius: %." + a + "f", skaicius);
    }
}

