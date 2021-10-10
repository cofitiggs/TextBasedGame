import entities.Monster;
import entities.Player;

import java.util.Random;

public class Fight {

    private Fight() {
        // empty constructor
    }

    public static void fight(Player player, Monster monster) {
        System.out.println("You have entered a fight with a monster! Get ready!");

        int playerHP = player.getHitPoints();
        int playerDamage;
        int playerHpRemaining = playerHP;

        int monsterHP = monster.getHitPoints();
        int monsterDamage;
        int monsterHpRemaining = monsterHP;

        while (playerHpRemaining > 0 && monsterHpRemaining > 0) {
            playerDamage = calcPlayerDamage(player.getDamage());
            System.out.println("You inflict " + playerDamage + " damage on the monster.");
            monsterHpRemaining -= playerDamage;
            monster.setHitPoints(monsterHpRemaining);
            System.out.println("The monster has " + monster.getHitPoints() + " hitpoints remaining.");
            if (monsterHpRemaining <= 0){
                System.out.println("Congratulations! You have defeated the monster!");
                break;
            }

            monsterDamage = calcMonsterDamage(monster.getDamage());
            System.out.println("The monster inflicts " + monsterDamage + " damage on you.");
            playerHpRemaining -= monsterDamage;
            player.setHitPoints(playerHpRemaining);
            System.out.println("You have " + player.getHitPoints() + " hitpoints remaining.");
            if (playerHpRemaining <= 0){
                System.out.println("Sorry, but you have been defeated by the monster.");
                break;
            }
        }
    }

    private static int calcPlayerDamage(int playerDamage) {
        Random random = new Random();
        return random.nextInt(playerDamage+1);
    }

    private static int calcMonsterDamage(int monsterDamage) {
        Random random = new Random();
        return random.nextInt(monsterDamage+1);
    }
}
