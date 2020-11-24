package JavaIntermediate;

import java.util.LinkedList;

public class LLinkedList {
    public static void main(String[] args) {
        LinkedList linky = new LinkedList();
        linky.add("Antanas");
        linky.add("Alex");
        linky.add("Tadas");

        // linky.remove();  --> removes from the beginning

        System.out.println(linky);
        System.out.println(linky.get(2));

    }
}
