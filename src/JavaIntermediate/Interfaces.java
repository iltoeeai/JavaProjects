package JavaIntermediate;

interface WaterBottleInterface{

    String color = "Blue";

    void fillUp();
    void pourOut();
}
public class Interfaces implements WaterBottleInterface {
    public static void main(String[] args) {

        System.out.println(color);
        Interfaces ex = new Interfaces();
        ex.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("It is filled up");
    }

    @Override
    public void pourOut() {

    }
}
