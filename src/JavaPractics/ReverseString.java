package JavaPractics;

public class ReverseString {
    public static void main(String[] args) {
//        System.out.println("dog");
        String r = reverse("tadas");
        System.out.println(r);
    }

    public static String reverse(String s){
        char[] letters = new char[s.length()];

//        for(int i = 0; i<s.length(); i++){
//            System.out.println(s.charAt(i));
//        }
//        return s;
//    }
//        for(int i = s.length() - 1; i >= 0; i--){
//            System.out.println(s.charAt(i));
//        }
//        return s;
//    }

        int letterIndex = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }

        String reverse = "";
        for (int i = 0; i < s.length(); i++){
            reverse = reverse + letters[i];
        }
        return reverse;
    }
}
