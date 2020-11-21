package JavaBasics;

import java.util.ArrayList;

public class forEachLoops {
    public static void main(String[] args) {

        String[] cars = {"BMW", "Audi", "Opel", "Ford"};

        for (String car : cars){
            System.out.println(car);
        }

        System.out.println("------------------");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);

        for(int a : numbers){
            System.out.println(a);
        }
    }
}
