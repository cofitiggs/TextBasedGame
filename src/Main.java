import entities.Monster;
import entities.Player;

public class Main {
    public static void main(String[] args){
        Player testPlayer = new Player();
        testPlayer.setHitPoints(20);
        testPlayer.setDamage(2);

        Monster testMonster = new Monster();
        testMonster.setHitPoints(10);
        testMonster.setDamage(1);

        System.out.println("You have entered a fight with a monster! Get ready!");

        int playerHP = testPlayer.getHitPoints();
        int playerDamage = testPlayer.getDamage();
        int playerHpRemaining = playerHP;

        int monsterHP = testMonster.getHitPoints();
        int monsterDamage = testMonster.getDamage();
        int monsterHpRemaining = monsterHP;

        while (playerHpRemaining > 0 && monsterHpRemaining > 0) {
            System.out.println("You inflict " + playerDamage + " damage on the monster.");
            monsterHpRemaining -= playerDamage;
            testMonster.setHitPoints(monsterHpRemaining);
            System.out.println("The monster has " + testMonster.getHitPoints() + " hitpoints remaining.");
            if (monsterHpRemaining <= 0){
                System.out.println("Congratulations! You have defeated the monster!");
                break;
            }
            System.out.println("The monster inflicts " + monsterDamage + "damage on you.");
            playerHpRemaining -= monsterDamage;
            testPlayer.setHitPoints(playerHpRemaining);
            System.out.println("You have " + testPlayer.getHitPoints() + " hitpoints remaining.");
            if (playerHpRemaining <= 0){
                System.out.println("Sorry, but you have been defeated by the monster.");
                break;
            }
        }
    }
}
