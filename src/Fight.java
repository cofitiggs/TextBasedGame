import entities.Monster;
import entities.Player;

import java.util.Random;

public class Fight {

    private Fight() {
        // empty constructor
    }

    public static void fight(Player player, Monster monster) {
        System.out.println("You have entered a fight with a monster! Get ready!");

        while (player.getHitPoints() > 0 && monster.getHitPoints() > 0) {
            playerAttack(player, monster);
            if (monster.getHitPoints() <= 0){
                System.out.println("Congratulations! You have defeated the monster!");
                break;
            }

            monsterAttack(monster, player);
            if (player.getHitPoints() <= 0){
                System.out.println("Sorry, but you have been defeated by the monster.");
                break;
            }
        }
    }

    private static void playerAttack(Player player, Monster monster) {
        int playerDamage = calcPlayerDamage(player.getDamage());
        System.out.println("You inflict " + playerDamage + " damage on the monster.");
        monster.setHitPoints(monster.getHitPoints() - playerDamage);
        System.out.println("The monster has " + monster.getHitPoints() + " hitpoints remaining.");
    }

    private static void monsterAttack(Monster monster, Player player) {
        int monsterDamage = calcMonsterDamage(monster.getDamage());
        System.out.println("The monster inflicts " + monsterDamage + " damage on you.");
        player.setHitPoints(player.getHitPoints() - monsterDamage);
        System.out.println("You have " + player.getHitPoints() + " hitpoints remaining.");
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
