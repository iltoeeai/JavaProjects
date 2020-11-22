package JavaPractics;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {

        Random num = new Random();
        int x = num.nextInt(6) + 1;
        System.out.println("You rolled a: " + x);
    }
}
