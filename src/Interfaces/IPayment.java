package Interfaces;

public interface IPayment { //interfeisai apraso abstrakcius metodus, skirti dokumentuoti musu klase
    //pasakyti, kad sitoje klaseje prieinami tokie metodai
    String getBankAccountNumber();              //
    String getBankAccountOwnerName();           //getteriai
    double getAmount();                         //

    PaymentHistory[] getPaymentHistory();

    void addPaymentHistory(PaymentHistory paymentHistory);
}
