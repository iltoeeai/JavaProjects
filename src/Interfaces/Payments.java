package Interfaces;

public class Payments { //sudesim metodus

    public static void printPaymentInfo(IPayment[] payments){

        for(IPayment payment : payments){
            System.out.println(payment.getBankAccountNumber() + " " +
                    payment.getBankAccountOwnerName() + " " +
                    payment.getAmount());
        }
    }
    public static void printClientsMostActive(IPayment[] iPayments){}
}
