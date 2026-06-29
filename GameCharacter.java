public class GameCharacter {

    protected String name;
    protected int level;

    public GameCharacter(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void performSpecialAbility() {
        System.out.println(name + " performs a magical action.");
    }
}