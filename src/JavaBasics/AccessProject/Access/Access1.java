package JavaBasics.AccessProject.Access;

public class Access1 {

    //default, public, private, protected

    int hoursDefault = 3;
    int minutesDefault = 47;

    public int hoursPublic = 4;
    public int minutesPublic = 32;

    private int hoursPrivate = 5;
    private int minutesPrivate = 17;

    protected int hoursProtected = 6;
    protected int minutesProtected = 29;

    public int getHours(){ //works the same with the methods
        return hoursDefault;
    }




}
