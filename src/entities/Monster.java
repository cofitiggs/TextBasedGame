package entities;

public class Monster {
    private int defense;
    private int attackSpeed;
    private int damage;
    private int hitPoints;

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttackSpeed() {
        return this.attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "defense=" + defense +
                ", attackSpeed=" + attackSpeed +
                ", damage=" + damage +
                ", hitPoints=" + hitPoints +
                '}';
    }
}
