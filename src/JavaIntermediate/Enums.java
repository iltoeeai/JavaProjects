package JavaIntermediate;
enum Level{
        LOW, MEDIUM, HIGH;
}
public class Enums {


    public static void main(String[] args) {
//        System.out.println(levels[0]);
//        System.out.println(levels[1]);
//        System.out.println(levels[2]);

        Level l = Level.LOW;
//        System.out.println(l);

        switch (l){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }

}
