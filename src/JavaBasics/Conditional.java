package JavaBasics;

public class Conditional {
    public static void main(String[] args) {

        int a = (7 > 3) ? 7 : 3; //if true, then 7, otherwise 3

        System.out.println(a);

        String s = "hello";
        double result = s.equals("hello") ? 0.5 : 0.25;
        System.out.println(result);


    }
}
