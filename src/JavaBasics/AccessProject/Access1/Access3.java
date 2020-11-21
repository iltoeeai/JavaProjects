package JavaBasics.AccessProject.Access1;

import JavaBasics.AccessProject.Access.Access1;

public class Access3 { //PROTECTED CAN ONLY BE USED AT THE SAME PACKAGE
    //BUT IF Access3 extends Access1
    public static void main(String[] args) {
        Access1 a = new Access1();
        System.out.println("Default: ");
//        System.out.println(a.hoursDefault); // DEFAULT cant be accessed from other packages
//        System.out.println(a.minutesDefault);
        System.out.println("Method:"); //DEFAULT METHOD CAN BE RETURNED BECAUSE ITS PUBLIC
        System.out.println(a.getHours());
        System.out.println("-----------------------------------");

        System.out.println("Public: ");
        System.out.println(a.hoursPublic);
        System.out.println(a.minutesPublic);
        System.out.println("-----------------------------------");

//        System.out.println("Protected: ");
//        System.out.println(a.hoursProtected); //PROTECTED CAN ONLY BE USED AT THE SAME PACKAGE
//        System.out.println(a.minutesProtected);
//        System.out.println("-----------------------------------");
    }
}
