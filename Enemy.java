public class Enemy {

    private String name;
    private int health;
    private int attackPower;

    public Enemy(String name, int health, int attackPower) {

        this.name = name;
        this.health = health;
        this.attackPower = attackPower;

    }

    // Getters
    public String getName() {

        return name;

    }

    public int getHealth() {

        return health;

    }

    public int getAttackPower() {

        return attackPower;

    }

    // Setters
    public void setName(String name) {

        this.name = name;

    }

    public void setHealth(int health) {

        this.health = health;

    }

    public void setAttackPower(int attackPower) {

        this.attackPower = attackPower;

    }

}