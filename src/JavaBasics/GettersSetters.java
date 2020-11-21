package JavaBasics;

public class GettersSetters {

    String name;
    int age;

    public static void main(String[] args) {

        GettersSetters a = new GettersSetters();
        a.setName("Pablo");
        a.setAge(34);
        a.printDetails();
        System.out.println(a.getAge());
        System.out.println(a.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails(){
        System.out.println(name + ", " + age);
    }
}
