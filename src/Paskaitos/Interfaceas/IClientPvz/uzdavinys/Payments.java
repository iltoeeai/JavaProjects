package Paskaitos.Interfaceas.IClientPvz.uzdavinys;

public class Payments {

    public static void printPaymentInfo(IPayment[] payments) {
        for (IPayment payment : payments) {
            System.out.println(payment.getBankAccountNumber() + " "
                + payment.getBankAccountOwnerName() + " "
                + payment.getAmount());
        }
    }

    public static void printMostActive(IPayment[] payments) {
        //TODO
    }
}
