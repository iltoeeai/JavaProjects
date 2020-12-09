package Paskaitos.UzdavinysGeneric;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class Container<E> {

//    static double a = skaitytiIsFailo();
//
//    static {
//        if(Math.random() < 0.5) a = 100;
//        if(Math.random() < 0.5) a *= 2;
//        try{
//            skaitytiIsFailo();
//        } catch (Exception e){
//            a = 0;
//        }
//    }

    List<E> list = new ArrayList<>();
    // 2 budas:
//    List<E> list;
//
//    public Container() {
//        list = new ArrayList<>();
//    }

//    // 3 budas: blokai vykdomi pries bet kuri konstruktoriu
//    List<E> list;
//    {
//        //...
//        list = new ArrayList<>();
//    }

    public void add(E e){
        list.add(e);
    }
    public Iterable<E> order(Comparator<E> cmp){
        list.sort(cmp);
        return list;
    }

//    static double skaitytiIsFailo(){
//        //...
//        throw new RuntimeException("Kazkas negerai");
//    }
}
