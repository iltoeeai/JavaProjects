package JavaBasics;
import java.util.ArrayList;


public class ArrayListProject {
    public static void main(String[] args) {

        //array:
        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Kiwi";
        fruits[2] = "Apple";
        System.out.println(fruits[1]);

        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Kiwi");
        fruitList.add("Apple");
        fruitList.add("Watermelon");
        fruitList.remove("Kiwi");
//        fruitList.clear(); clears arraylist
        boolean a = fruitList.contains("Raspberry"); //searches the arraylist and returns true/false
        System.out.println(a + "\n");
        System.out.println(fruitList + "\n");
        System.out.println(fruitList.get(0)); //prints 0-th element

    }
}
