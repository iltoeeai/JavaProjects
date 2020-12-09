package Paskaitos.OptionalSrautai;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo3 {
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


        // Isvesti kiek ir kokiam darbuotojui ismoketa mazejimo tvarka
        salaries.stream()
//                .sorted((d1, d2) -> {
//                    if(d1.getSalary() < d2.getSalary()) return 1;
//                    else if (d1.getSalary() > d2.getSalary()) return -1;
//                    return 0;

//                })
                .sorted((d1, d2) -> -Double.compare(d1.getSalary(), d2.getSalary()))
                .forEach (d -> System.out.println(d.getEmployee().getName() + " " + d.getSalary()));


        // Kiek ismoketa viso pinigu kiekvienam darbuotojui ismokejimu mazejimo tvarka

        Map<Employee, List<Salary>> map = salaries.stream()
                .collect(Collectors.groupingBy(s -> s.getEmployee()));
        System.out.println(map);

        Map<Employee, Double> map2 = salaries.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getEmployee(),
                        Collectors.reducing(0.0, (Salary s) -> s.getSalary(),(x, y) -> x+y)));
        System.out.println(map2);

    }
}

