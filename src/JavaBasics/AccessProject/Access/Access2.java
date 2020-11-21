package JavaBasics.AccessProject.Access;

public class Access2 {
    public static void main(String[] args) {
        Access1 a = new Access1();
        System.out.println("Default: ");
        System.out.println(a.hoursDefault);
        System.out.println(a.minutesDefault);
        System.out.println("Method:");
        System.out.println(a.getHours());
        System.out.println("-----------------------------------");

        System.out.println("Public: ");
        System.out.println(a.hoursPublic);
        System.out.println(a.minutesPublic);
        System.out.println("-----------------------------------");

//        System.out.println("Private: ");
//        System.out.println(a.hoursPrivate); //  PRIVATE CAN ONLY BE USED AT THE SAME FILE
//        System.out.println(a.minutesPrivate);
//        System.out.println("-----------------------------------");

        System.out.println("Protected: ");
        System.out.println(a.hoursProtected); //PROTECTED CAN ONLY BE USED AT THE SAME PACKAGE
        System.out.println(a.minutesProtected);
        System.out.println("-----------------------------------");
    }
}
