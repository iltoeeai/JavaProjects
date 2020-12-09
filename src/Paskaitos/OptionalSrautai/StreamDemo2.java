package Paskaitos.OptionalSrautai;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("A", 1),
                new Employee("X", 10),
                new Employee("X", 12),
                new Employee("M", 31),
                new Employee("A", 41),
                new Employee("X", 7)
                );
        //suskaiciuoti, kiek yra darbuotoju skirtingu vardu
        // Employee -> name (String) -> distinct() -> peek -> count()

        long cnt = employees.stream()
                .map(e -> e.getName())
                .peek(e -> System.out.println("pirmas tarpinis spausdinimas: "+e))
                .distinct() //isrinkti irasus, kurie yra unikalus
                .peek(e -> System.out.println("antras tarpinis spausdinimas: "+e))
                .count();
        System.out.println("Viso = " + cnt);

        cnt = employees.stream()
                .map(e -> e.getName())
                .collect(Collectors.toSet())
                .size();

//        Arrays.asList(1,2,3,4,5,6,7,8).stream();
//       int total = IntStream.of(1,2,3).sum();
        int total = IntStream.range(1,11)
                .filter(x -> x % 2 == 0) //vien tik lyginiai
                .sum();
        System.out.println("2+4+..+10= " + total);
        total = Stream.of(1,2,3,4,5,6,7,8, 9, 10)
                .filter(x -> x % 2 == 0)
                .reduce(0, (x, y) -> {
                    System.out.println("reduce: " + x + "+" + y + "=" + (x+y));
                    return x+y;
                });
        System.out.println("2+4+..+10= " + total);  //lambdoj tik final kintamieji

//        //sitaip labai blogai, lambdoj globaliu kintamuju negali buti
//        static int suma = 0;
//        Stream.of(1,2,3,4,5,6,7,8,9,10)
//                .map(x -> suma += x);
//        System.out.println("suma= " + suma);


        // Uzdavinys - atspausdinti varda ir kiek darbuotoju yra su tokiu pat vardu
        // Employee -> goupBy Emplyee.name: Map<String, List<Employee>>
        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getName()));
        map.keySet().forEach(e -> {
            System.out.println("Su vardu " + e + " yra darbuotoju " +
                    map.get(e).size());
        });

        employees.stream()
                .collect(Collectors.groupingBy(e -> e.getName()))
                .entrySet()
                .forEach(e->{
                    System.out.println("Su vardu "+ e.getKey() + " yra " + e.getValue().size());
                });

    }
}
