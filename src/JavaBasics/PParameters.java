package JavaBasics;

public class PParameters {
    public static void main(String[] args) {
        saySomething("Tadas");
        printInfo("Jonas", 25);
        System.out.println(add(4, 5));
    }
    public static void saySomething(String s){
        System.out.println(s);
    }

    public static void printInfo(String name, int age){
        System.out.println(name + " is "+ age + " years old");
    }

    public static int add(int x, int y){
        return x + y;
    }
}
