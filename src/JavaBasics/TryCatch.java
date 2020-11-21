package JavaBasics;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What's your fav number?");

        try{
            int n = scan.nextInt();
            System.out.println(n);
        } catch (Exception e){
            System.out.println("Please enter a number");

        }
    }
}
