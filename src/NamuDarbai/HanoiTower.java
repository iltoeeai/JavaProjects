package NamuDarbai;

public class HanoiTower {
    static void HanoiBokstas(int n, char A, char B, char C)
    {

        if (n == 1)
        {
            System.out.println("Paimti virsutini diska nuo strypo " +  A + " ant strypo " + B);
            return;
        }
        HanoiBokstas(n-1, A, C, B);
        System.out.println("Paimti diska " + n + " nuo strypo " +  A + " ant strypo " + B);
        HanoiBokstas(n-1, C, B, A);

    }

    public static void main(String args[])
    {
        int n = 6;
        HanoiBokstas(n,'A','C', 'B');
        int ejimuSk = (int) Math.pow(2, n) - 1;
        System.out.println("Is viso padaryta ejimu: " + ejimuSk);
    }
}
