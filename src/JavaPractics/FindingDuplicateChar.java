package JavaPractics;

public class FindingDuplicateChar {
    public static void main(String[] args) {

        String sentence = "How many duplicates are there?";
        System.out.println(sentence);

        String characters = "";
        String duplicates = "";
        for (int i = 0; i < sentence.length(); i++){
//            System.out.println(sentence.charAt(i));
            String current = Character.toString(sentence.charAt(i));
            if(characters.contains(current)){
                if (!duplicates.contains(current)){
                    duplicates += current + ",";
                }


            }

            characters += current;

        } System.out.println(duplicates);
    }
}
