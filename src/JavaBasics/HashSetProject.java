package JavaBasics;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProject {
    public static void main(String[] args) {

        HashSet<String> h = new HashSet<String>();
        h.add("lemur");
        h.add("orangutan");
        h.add("Spider monkey");
        h.add("gorilla");

//        h.remove("lemur"); //removes
//        System.out.println(h.isEmpty()); //shows if its empty or not


        System.out.println(h);
        System.out.println(h.size());   //h.contains("lemur") --> shows if it contains

        System.out.println("----------------------------------------");

        HashSet<Integer> hashbrowns = new HashSet<Integer>();
        hashbrowns.add(13);
        hashbrowns.add(24);
        hashbrowns.add(5);

        //will make HashSet to array:

        Object[] o = hashbrowns.toArray();
        System.out.println(o[0]); //prints out the number, but the ORDER IS NOT CLEAR
        System.out.println("----------------------------------------");

        //to print all the elements

        Iterator<Integer> it = hashbrowns.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
