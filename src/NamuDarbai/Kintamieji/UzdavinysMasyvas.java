package NamuDarbai.Kintamieji;

import java.util.Arrays;

public class UzdavinysMasyvas {

    public static void main(String[] args) {
        int[] arr =  {-10, 0, 2, 9, -5};

        Arrays.sort(arr);

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }
}
