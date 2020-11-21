package JavaBasics;

public class Break {
    public static void main(String[] args) {

        //break statement exits a loop or switch

        int [] numbers = {10, 20, 30, 40, 50};

         for (int i = 0; i < numbers.length; i++){

             if(numbers[i] == 30){
                 break;
             }
             System.out.println(numbers[i]);
         }

         System.out.println("---------------------------");

        int j = 1;

         switch (j){
             case 0:
                 System.out.println("zero");
                 break;
             case 1:
                 System.out.println("one");
                 break;
             default:
                 System.out.println("default");
                 break;
         }
        System.out.println("---------------------------");

         for(int i = 0; i < 5; i++){
             for(int k = 0; k < 3; k++){
                 System.out.println(i + ", " + k);
                 break; // k value will always be 0 because it only breaks inside the second for loop
             }
         }
    }
}
