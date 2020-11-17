package NamuDarbai.Ciklai;

public class PirminiaiSkaiciai {

    public static void main(String[] args) {

        int maziausias = 0, didziausias = 1000;

        while (maziausias < didziausias) {
            boolean flag = false;

            for(int i = 2; i <= maziausias/2; ++i) {
                // condition for nonprime number
                if(maziausias % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && maziausias != 0 && maziausias != 1)
                System.out.println(maziausias + " ");

            ++maziausias;
        }
    }


}
