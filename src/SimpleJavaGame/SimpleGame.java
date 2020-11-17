package SimpleJavaGame;

import java.util.Random;
import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {

        //System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //Game variables
        String[] enemies = { "Skeleton", "Zombie", "Warrior", "Assassin"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        //Player variables
        int health = 100;
        int attackDamage = 50;
        int numHealthPots = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50;  //percentage

        boolean running = true;

        System.out.println("Welcome to the Dungeon");

        GAME:
        while (running){
            System.out.println("-------------------------------------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies [rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " has appared! #\n");

            while(enemyHealth > 0){
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP:" + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");

                String input = in.nextLine();
                if (input.equals("1")){
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + "damage.");
                    System.out.println("\t> You recieve " + damageTaken + " in retaliation!");
                    if(health<1){
                        System.out.println();
                    }
                }
                else if(input.equals("2")){

                }
                else if(input.equals("3")) {

                }
                else {

                }
            }
        }
    }
}
