package JavaBasics.AccessProject.Access1;

import JavaBasics.AccessProject.Access.Access1;

public class Access4 extends Access1 {
    public static void main(String[] args) {
        Access4 a = new Access4(); //FOR PROTECTED NEED TO WRITE LIKE THIS
        System.out.println("Protected: ");
        System.out.println(a.hoursProtected); //PROTECTED CAN ONLY BE USED AT THE SAME PACKAGE UNLESS IT EXTENDS
        System.out.println(a.minutesProtected);
        System.out.println("-----------------------------------");

//        Access1 D = new Access1();
//        System.out.println("Default: ");
//        System.out.println(D.hoursDefault); // DEFAULT cant be accessed from other packages
//        System.out.println(D.minutesDefault);
//        System.out.println("-----------------------------------");
    }
}
