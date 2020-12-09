package Paskaitos.UzdavinysSaugykla;

public class Main {
    public static void main(String[] args) {

        Saugykla<Integer> saugykla = new Saugykla<>();
        saugykla.add(100);
        saugykla.add(99);
        saugykla.add(-10);
        saugykla.add(15);

        System.out.println("Ta pati tvarka");
        for (Integer i : saugykla.asc()){
            System.out.println(i);
        }

        System.out.println("Atvirkstine tvarka");
        for (Integer i : saugykla.desc()){
            System.out.println(i);
        }

        System.out.println("Filtras: tik teigiami");
        for (Integer i : saugykla.filter(x -> x > 0)){
            System.out.println(i);
        }
    }
}
