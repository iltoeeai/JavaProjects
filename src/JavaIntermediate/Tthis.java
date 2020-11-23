package JavaIntermediate;

public class Tthis {

    int a;
    int b;
    String food;
    char size;

    public void setData(int a, int b){  //this cant be used with static
        this.a = a;
        this.b = b;
    }
    public void setData1(String food, char size){
        this.food = food;
        this.size = size;
    }

    public static void main(String[] args) {
        Tthis t = new Tthis();
        t.setData(4, 3);
        System.out.println(t.a);
        System.out.println(t.b);

        Tthis f = new Tthis();
        f.setData1("soup", 'M');
        System.out.println(f.food);
        System.out.println(f.size);
    }
}
