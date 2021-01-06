package Paskaitos.OptionalSrautai;

import java.util.Arrays;
import java.util.List;

public class StreamDemo4 {
    public static void main(String[] args) {

        List<Salary> salaries = Arrays.asList(
                new Salary(new Employee("A1", 1), 100.),
                new Salary(new Employee("A2", 2), 200.),
                new Salary(new Employee("A1", 1), 300.),
                new Salary(new Employee("A2", 2), 400.),
                new Salary(new Employee("A2", 2), 500.),
                new Salary(new Employee("A3", 3), 600.),
                new Salary(new Employee("A4", 4), 800.),
                new Salary(new Employee("A5", 5), 300.),
                new Salary(new Employee("A5", 5), 700.),
                new Salary(new Employee("A6", 6), 150.)
        );

        salaries.stream()
                //tarpines operacijos
                .peek(s -> System.out.println("Pries: " + s))
                .sorted((s1, s2)-> Double.compare(s1.getSalary(), s2.getSalary()))
                .forEach(e-> System.out.println("Po: " + e)); //count, collect.... galutine operacija butina

    }
}
