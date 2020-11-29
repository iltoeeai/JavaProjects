package BankingApplication;

import java.util.Scanner;

public class Account {
    //klases kintamieji
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    //klases konstruktorius
    Account(String cname, String cid){
        customerName = cname;
        customerID = cid;
    }

    //Metodas pervesti pinigus
    void deposit(int amount){
        if (amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    //Metodas nusiimti pinigus
    void withdraw(int amount){
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    //Metodas, parodantis praeita veiksma (transaction)
    void getPreviousTransaction(){
        if (previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0){
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else{
            System.out.println("No transaction occured");
        }
    }

    //Metodas, skaiciuojantis palukanas nuo esamos banke pinigu sumos po n metu
    void calculateInterest(int years){
        double interestRate = .0185;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest rate is: " + (100 * interestRate) + "%");
        System.out.println("After " + years + " years, your balance will be: " + newBalance);
    }
    //Metodas, parodantis pagrindini menu
    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + " ! ");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");

        do{
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch (option){

                    //A variantas leidzia perziureti balansa
                case 'A' :
                    System.out.println("==============================");
                    System.out.println("Balance = $" + balance);
                    System.out.println("==============================");
                    System.out.println();
                    break;
                    //B variantas leidzia papildyti saskaita banke
                case 'B' :
                    System.out.println("Enter an amount to deposit: ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                    //C variantas leidzia issiimti pinigu
                case 'C' :
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;
                    //D variantas leidzia pamatyti artimiausia atlikta veiksma
                case 'D' :
                    System.out.println("==============================");
                    getPreviousTransaction();
                    System.out.println("==============================");
                    System.out.println();
                    break;
                    //E paskaiciuoja palukanas esamai sumai banke
                case 'E' :
                    System.out.println("Enter how many years of acrued interest: ");
                    int years = scanner.nextInt();
                    calculateInterest(years);
                    break;
                    //F leidzia klientui iseiti is programos
                case 'F' :
                    System.out.println("==============================");
                    break;
                    //Default leidzia klientui suprasti, kad jis ivede klaidinga raide
                default:
                    System.out.println("Error: invalid option. Please enter A, B, C, D, E, F");
                    break;
            }
        } while (option != 'F');
        System.out.println("Thank you for banking with us!");
    }


}
