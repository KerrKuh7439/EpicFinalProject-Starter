/**
 * Represents the player in the game.
 *
 * Student Notes:
 * - You will expand this class over time.
 * - Add more fields later such as health, score, inventory, gold, energy, or rank.
 * - Keep fields private and use getters/setters where appropriate.
 */
public class Player {

    private String name;
    private int level;
    private GameMode gameMode;

    /**
     * Creates a player with a name and default starting values.
     *
     * @param name the player's name
     */
    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.gameMode = null;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }
}
