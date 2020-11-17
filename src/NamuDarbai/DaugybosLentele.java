package NamuDarbai;

public class DaugybosLentele {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 4; j++) {
                System.out.print(j + "*" + i + "=" );
                System.out.print(i * j + " ");
                System.out.print("\t");
            }

            System.out.print("\n");
        }
        System.out.print("\n" + "\n");

        for (int i = 1; i < 10; i++) {

            for (int j = 4; j < 7; j++) {
                System.out.print(j + "*" + i + "=" );
                System.out.print(i * j + " ");
                System.out.print("\t");
            }

            System.out.print("\n");
        }

        System.out.print("\n" + "\n");
        for (int i = 1; i < 10; i++) {

            for (int j = 7; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" );
                System.out.print(i * j + " ");
                System.out.print("\t");
            }

            System.out.print("\n");
        }
    }
//    int sandauga = i * j;
//                int a;
//                for (a = 1; a < 10; a++) {
//
//                    System.out.printf("%-10s %-10s %-10s\n", (i*a) + "*" + j*a + " = " + sandauga, (i + i*a) + "*" + j*a
//                            + " = " + sandauga, (i + 2 * i) + "*" + j*a + " = " + sandauga);
//                }
}

