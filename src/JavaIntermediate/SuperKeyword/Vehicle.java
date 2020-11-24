package JavaIntermediate.SuperKeyword;

class Vehicle {

    int maxSpeed = 120;

    public void vroom(){
        System.out.println("Vroom vroom");
    }

    //a constructor is a method that makes the object
}

class Car extends Vehicle{

    int maxSpeed = 100;

    public void vroom(){
        super.vroom(); // takes from parent class
    }


    public void display(){
//        System.out.println(maxSpeed); shows the value that is in the class
        System.out.println(super.maxSpeed);
    }

    Car(){
        System.out.println("we are in constructor");
    }
}


