package JavaBasics;

import java.util.HashMap;

public class HashMapProject {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 88;

        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);
        System.out.println(happy);
        System.out.println(happy.get("c"));

        System.out.println("----------------------------------------------------------");

        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("Petras123", "slaptazodisPetr"); //KEY IS ON THE LEFT, VALUE IS ON THE RIGHT
        fun.put("Antanas12", "slaptazodisAntan");
        fun.put("Jonas333", "slaptazodisJon");
        fun.put("OnaOna", "slaptOnut");

        fun.remove("Jonas333");
        System.out.println(fun);
        System.out.println(fun.containsValue("slaptOnut"));
        System.out.println(fun.containsKey("Petras123"));//KEY ON THE LEFT

        System.out.println("----------------------------------------------------------");

        System.out.println(fun.replace("Antanas12", "pakeistasSlapt"));//returns old value
        System.out.println(fun); //returns in a different order


    }
}
