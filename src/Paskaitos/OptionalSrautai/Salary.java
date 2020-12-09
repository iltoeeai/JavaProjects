package Paskaitos.OptionalSrautai;

import java.util.Objects;

public class Salary {

    private Employee employee;
    private double salary;

    public Salary(Employee employee, double salary) {
        this.employee = employee;
        this.salary = salary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary1 = (Salary) o;
        return Double.compare(salary1.salary, salary) == 0 && Objects.equals(employee, salary1.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, salary);
    }

    @Override
    public String toString() {
        return "Salary{" +
                "employee=" + employee +
                ", salary=" + salary +
                '}';
    }
}
