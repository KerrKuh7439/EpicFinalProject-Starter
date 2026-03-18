/**
 * Represents a character in the game.
 *
 * Programmers will expand this class in later weeks.
 */
public class Character {

    private String name;
    private int power;

    public Character(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getSummary() {
        return "Character: " + name + " | Power: " + power;
    }
}
