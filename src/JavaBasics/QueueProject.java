package JavaBasics;

import java.util.LinkedList;
import java.util.Queue;

public class QueueProject {
    public static void main(String[] args) {

        Queue<String> bbqLine = new LinkedList<String>();
        bbqLine.add("Jackson");
        bbqLine.add("Tyreek");
        bbqLine.add("Susan");

        System.out.println(bbqLine);

        bbqLine.peek();
        bbqLine.poll();
        System.out.println(bbqLine);
        System.out.println("--------------------------");


        Queue<String> q = new LinkedList<String>();
        q.add("A");
        q.add("B");
        q.add("C");

        System.out.println(q);
        System.out.println(q.size()); //can make contains
        System.out.println(q.toArray()[0]); //can make to arrays


    }
}
