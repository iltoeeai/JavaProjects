package Paskaitos;

public class Rekursija {
    public static void main(String[] args) {
        int n9 = faktorialas(9); //kvieciu metoda kaip israiska ir pasiimu i int n10
        System.out.println(n9);
    }

   // rekursija
    static int faktorialas(int n){
        if(n==2) return 2;
        return n * faktorialas(n - 1);
        }

}

