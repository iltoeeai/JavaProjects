package JavaIntermediate;

abstract class Dog{
//    String breed;

    public void bark(){
        System.out.println("Bark!");
    }

    public abstract void poop();  //abstract method is a method that isnt implemented yet
}

class Chihuahua extends Dog{ //chihuahua is an extension of dog. can use everything that dog has through Chihuahua
                                //if its an extension it already has what a dog has
public void poop(){
    System.out.println("Dog pooped");
}
}

public class AbstractClass {
    public static void main(String[] args) {
        Chihuahua c = new Chihuahua();

        c.bark();
        c.poop();
    }
}
