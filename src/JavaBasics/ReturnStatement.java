package JavaBasics;

public class ReturnStatement {
    public static void main(String[] args) {

        //return statement happens inside the methods
        //return statement let you run a method and bring the results of that method into a variable you want

        printAMessage();
//        add(5,4);

        int sum = add(5,4);
        System.out.println(sum);

        String shouting = caps("why are yu reading my diary?!");
        System.out.println(shouting);

        int[] awesomeArray = gimmeArrayFromInts(3,7, 1);
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
        System.out.println(awesomeArray[2]);

    }

    //this one is called a method:
        public static void printAMessage(){ //void doesnt return anything
            System.out.println("first method");
        }

//        public static void add(int a, int b){
//            System.out.println(a + b);
//        }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String caps(String s){
        return s.toUpperCase();
    }

    public static int[] gimmeArrayFromInts(int q, int w, int e) {
        int [] array = new int[3];
        array[0] = q;
        array[1] = w;
        array[2] = e;
        return array;

    }



}
