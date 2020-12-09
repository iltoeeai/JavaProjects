package Paskaitos.Console;

import java.util.Scanner;

public class ConsoleInputDemo {
    public static void main(String[] args) {
        System.out.print("Įveskite vardą: ");
        Scanner scanner = new Scanner(System.in);
        String vardas = scanner.nextLine();
        System.out.print("koks amzius: ");
        int amzius = scanner.nextInt();
        System.out.println("Vardas = " + vardas);
        System.out.println("Amzius = " + amzius);
    }
}
