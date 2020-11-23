package JavaIntermediate.SubclassAndSuperclass;

public class Main {
    public static void main(String[] args) {
        Shoe s = new Shoe("Nike", 10);
        System.out.println(s.brand);

        Walking w = new Walking(true, "Nike", 10);
        System.out.println(w.goreTex);

        Running r = new Running(5., "Nike", 10);
        System.out.println(r.weight);
    }
}
