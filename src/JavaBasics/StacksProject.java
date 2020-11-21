package JavaBasics;

import java.util.Stack;

public class StacksProject {
    public static void main(String[] args) {

        Stack<String> games = new Stack<String>();

        games.add("Call of Duty");
        games.add("Guitar Hero");
        games.add("Super Mario");

        System.out.println(games.pop());
        System.out.println(games);

        System.out.println("------------------------------");


        Stack<String> videoGames = new Stack<String>();

        videoGames.add("Call of Duty");
        videoGames.add("Guitar Hero");
        videoGames.add("Super Mario");

        System.out.println(videoGames.peek());
        System.out.println(videoGames);
        System.out.println("------------------------------");


        // we want to have red at the bottom, blue in the middle and yellow on top:
        // Y
        // B
        // R

        Stack<Character> tower = new Stack<Character>();
        tower.add('R');
        tower.add('B');
        tower.add('Y');

        System.out.println(tower);
        System.out.println(tower.contains('J'));
        System.out.println(tower.get(0));
        System.out.println(tower.get(1));
        System.out.println(tower.set(0, 'P'));
        System.out.println(tower);
        System.out.println(tower.size());

    }
}
