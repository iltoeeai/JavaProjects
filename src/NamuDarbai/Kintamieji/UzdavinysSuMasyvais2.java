package NamuDarbai.Kintamieji;

public class UzdavinysSuMasyvais2 {
    public static void main(String[] args) {

        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};
        double suma = 0;
        double suma1 = 0;
        double vidurkis = 0;
        double vidurkis1 = 0;
        for (int elem : a) {
            suma += elem;
            vidurkis = suma / a.length;
        };
        for (int e : b) {
            suma1 += e;
            vidurkis1 = suma1 / b.length;
        }
        double vidurkiuSkirtumas1 = vidurkis - vidurkis1;

        System.out.println("Vidurkis = " + vidurkis);
        System.out.println("Vidurkis1 = " + vidurkis1);
        System.out.printf("Vidurkiu skirtumas: %.5f", vidurkiuSkirtumas1);

    }
}
