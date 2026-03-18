/**
 * Represents a mission or quest in the game.
 */
public class Mission {

    private String title;
    private boolean completed;

    public Mission(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeMission() {
        completed = true;
    }
}
