package Interfaces;

public class Task1 {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setFirstName("Jonas");
        e1.setLastName("Jonaitis");
        e1.setBankAccountNumber("LT112233445566");
        e1.setAmount(1000.);

        Employee e2 = new Employee();
        e2.setFirstName("Ona");
        e2.setLastName("Onaite");
        e2.setBankAccountNumber("LT1324324234");
        e2.setAmount(2300.);

        Client c2 = new Client();
        c2.setName("Microsoft DE");
        c2.setBankAccount("DE112223323232");
        c2.setAmount(-1300.75);

        IPayment[] payments = { e1, c2, e2 };
        Payments.printPaymentInfo(payments); //galima kviesti, nes yra static zodis Payments klaseje
    }
}
