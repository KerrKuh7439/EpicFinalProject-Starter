/**
 * Parent class for all character types.
 * Students will extend this class in Week 3.
 */
public abstract class Character {

    protected String name;
    protected int health;
    protected int power;

    public Character(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public abstract String useAbility();
}
