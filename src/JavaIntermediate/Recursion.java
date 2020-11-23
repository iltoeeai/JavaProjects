package JavaIntermediate;

public class Recursion {
    //recursion is a method being called inside of itself
    public static void main(String[] args) {
        sayHi(5);
        System.out.println("-------------");
        countBackwards(14);

    }
    public static void sayHi(int n){
        if (n==0){
            System.out.println("done");
        }else {
            System.out.println("hi");
            n--;
            sayHi(n);
        }
    }
    public static void countBackwards(int m){
        if (m==0){
            System.out.println("done");
        }else{
            System.out.println(m);
            m--;
            countBackwards(m);
        }
    }
}
