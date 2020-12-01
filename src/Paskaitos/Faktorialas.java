package Paskaitos;

public class Faktorialas {
    public static void main(String[] args) {
        int n10 = faktorialas(10); //kvieciu metoda kaip israiska ir pasiimu i int n10
        System.out.println(n10);
    }

    //n! = 1*2*3*4... *n
    //n! = n * (n-1) * (n-2) * ... *2
    static int faktorialas(int n){
        int f = 1;
        for (n = n; n>= 2; n--){
            f = f * n;
        }
        return f;
    }
}
