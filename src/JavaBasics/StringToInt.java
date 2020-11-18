package JavaBasics;

public class StringToInt {
    public static void main(String[] args) {

        String s = "102";
        int n = Integer.parseInt(s);
        System.out.println(n + 4);

        int number = 8;
        System.out.println(Integer.toString(number) + 1);

        String text = "age: 47";
        text = text.replaceAll("\\D+","");
        System.out.println(text);

    }
}
