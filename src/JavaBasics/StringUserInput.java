package JavaBasics;

import java.util.Scanner;

public class StringUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter pokemon name 1: ");
        String pokemon1 = scan.nextLine();

        System.out.println("Enter pokemon name 2: ");
        String pokemon2 = scan.nextLine();

        System.out.println("Enter pokemon name 3: ");
        String pokemon3 = scan.nextLine();

        System.out.println("Enter pokemon name 4: ");
        String pokemon4 = scan.nextLine();

        System.out.println("Enter pokemon name 5: ");
        String pokemon5 = scan.nextLine();

        System.out.println("Here are your pokemon:");
        System.out.println(pokemon1);
        System.out.println(pokemon2);
        System.out.println(pokemon3);
        System.out.println(pokemon4);
        System.out.println(pokemon5);

    }
}
