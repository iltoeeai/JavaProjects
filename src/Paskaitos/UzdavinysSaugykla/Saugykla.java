package Paskaitos.UzdavinysSaugykla;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Saugykla<E> {

    private List<E> listas = new ArrayList<>();

    public void add(E e){
        listas.add(e);
    }

    public Iterable<E> asc(){
        return listas;
    }

    public Iterable<E> desc(){                     // atvirksciai susideda
        List<E> d = new ArrayList<>();
        listas.forEach(e -> d.add(0, e));
        return d;
    }

    public Iterable<E> filter(Predicate<E> f){     // Predicate - interface su vienu metodu
        List<E> d = new ArrayList<>();
        listas.forEach(e -> {
            if(f.test(e)) {
                d.add(e);
            }
        });
        return d;
    }
}
