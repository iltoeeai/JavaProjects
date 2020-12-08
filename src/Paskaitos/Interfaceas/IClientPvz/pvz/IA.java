package Paskaitos.Interfaceas.IClientPvz.pvz;

public interface IA {

    double area();

    default void printName() {
        System.out.println("IA");
    }
}
