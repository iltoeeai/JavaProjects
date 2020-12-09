package Paskaitos.Exceptions;

public class ExceptionDemo2 {

    public static void main(String[] args) {
        int[] m1 = {-3, 3, 4, 2};
        System.out.println("Maksimali reiksme = " + ManoMath.max(m1));

        int[] m2 = {2};
        System.out.println("Maksimali reiksme = " + ManoMath.max(m2));

        int[] m3 = {};
        System.out.println("Maksimali reiksme = " + ManoMath.max(m3));

        int[] m4 = null;
        System.out.println("Maksimali reiksme = " + ManoMath.max(m4));
    }
}

class ManoMath{
    static int max(int[] masyvas){
        try{
//        if(masyvas.length == 0){
//            throw new TusciasMasyvas();
//        }
        int x = masyvas[0];
        for(int i=1; i< masyvas.length; i++){
            if (x<masyvas[i]){
                x=masyvas[i];
            }
        }
        return x;
        } catch (NullPointerException e){
            throw new NeteisingiDuomenys(e);

        }
        catch (Exception e){
            throw new SkaiciavimoKlaida(e);
        }
    }
}

//
//class TusciasMasyvas extends RuntimeException{
//
//}

class ManoMathKlaida extends RuntimeException{
    public ManoMathKlaida(Throwable cause) {
        super(cause);
    }
}
class NeteisingiDuomenys extends ManoMathKlaida{
    public NeteisingiDuomenys(NullPointerException cause) {
        super(cause);
    }
}

class SkaiciavimoKlaida extends ManoMathKlaida{
    public SkaiciavimoKlaida(Exception cause) {
        super(cause);
    }
}
