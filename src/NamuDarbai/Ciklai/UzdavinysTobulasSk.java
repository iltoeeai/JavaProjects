package NamuDarbai.Ciklai;

import java.util.Scanner;

public class UzdavinysTobulasSk {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int maxNumber = scanner.nextInt();

        int tikrinamasSkaicius = 1;
        while (tikrinamasSkaicius<=maxNumber){

            if (arSkaiciusTobulas(tikrinamasSkaicius)){
                System.out.println("Found " + tikrinamasSkaicius);
            }
            tikrinamasSkaicius += 1;
        }
    }
    private static boolean arSkaiciusTobulas(int tikrinamasSkaicius){
        int suma = 0;

        for (int i = 1; i<tikrinamasSkaicius; i++){
            if (tikrinamasSkaicius % i == 0){
                suma += i;
            }
        }

        if (suma == tikrinamasSkaicius) return true;
        else return false;

}}
