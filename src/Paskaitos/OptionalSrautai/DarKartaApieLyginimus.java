package Paskaitos.OptionalSrautai;

import java.util.Objects;

public class DarKartaApieLyginimus {
    public static void main(String[] args) {
        ManoKlase m1 = new ManoKlase("A");
        ManoKlase m2 = new ManoKlase("A");

        System.out.println(m1 == m2 ? "m1 = m2" : "m1 != m2");
        System.out.println(m1.equals(m2) ? "m1 equals m2" : "m1 !equals m2");
        System.out.println(Objects.equals(m1,m2) ? "m1 equals m2" : "m1 !equals m2");

        ManoKlaseEx x1 = new ManoKlaseEx("A");
        ManoKlaseEx x2 = new ManoKlaseEx("A");
        System.out.println(x1 == x2 ? "x1 = x2" : "x1 != x2");
        System.out.println(x1.equals(x2) ? "x1 equals x2" : "x1 !equals x2");


    }
}

class ManoKlase{
    private String laukas1;

    public ManoKlase(String laukas) {
        this.laukas1 = laukas;
    }

    public String getLaukas1() {
        return laukas1;
    }

    @Override
    public String toString() {
        return "ManoKlase{" +
                "laukas='" + laukas1 + '\'' +
                '}';
    }


}

class ManoKlaseEx extends ManoKlase{
    public ManoKlaseEx(String laukas1){
        super(laukas1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManoKlase manoKlase = (ManoKlase) o;
        return Objects.equals(getLaukas1(), manoKlase.getLaukas1());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLaukas1());
    }
}