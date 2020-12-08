package Paskaitos.Figura.d1;

public abstract class Figura { //abstrakti klase
    //niekur nerasiu new Figura, negaliu konstruoti su tokia klase, ji yra sablonas
    //jos paskirtis - tik buti extendinta

    private double x; //visi klases laukai pagal nutylejima turi buti private
    private double y;
    private double laipsnis;

    public Figura(double x, double y, double laipsnis) {
        this.x = x;
        this.y = y;
        this.laipsnis = laipsnis;
    }

    public abstract double plotas();

    public abstract double perimetras();

//    public double plotas() {
//        return 0;
//    }
//
//    public double perimetras() {
//        return 0;
//    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getLaipsnis() {
        return laipsnis;
    }

    public void setLaipsnis(double laipsnis) {
        this.laipsnis = laipsnis;
    }
}

