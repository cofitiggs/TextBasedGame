import entities.Monster;
import entities.Player;

public class Main {
    public static void main(String[] args) {
        Player testPlayer = new Player();
        testPlayer.setHitPoints(20);
        testPlayer.setDamage(2);

        Monster testMonster = new Monster();
        testMonster.setHitPoints(10);
        testMonster.setDamage(1);

        Fight.fight(testPlayer, testMonster);
    }
}
