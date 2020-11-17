package NamuDarbai;

public class RyziuUzdavinys {
    public static void main(String[] args) {

        int i;
        double j, k, l;

        j = 1.0;
        l = 0.0;
//        k = 0.0;

        for (i=1; i <= 64; i++) {
            k = j - 1;
            k += 1;
            System.out.println(i + "- ame langelyje ryziu yra: " + Math.round(k));
            j *= 2;
            l = l + k;
            System.out.println("Jau is viso ryziu yra: " + Math.round(l));

        }


    }
}

