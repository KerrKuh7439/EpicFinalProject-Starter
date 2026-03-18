import java.util.Scanner;

/**
 * Controls the main game flow and menu system.
 *
 * Student Notes:
 * - This class handles the main menu and user choices.
 * - You will expand this class throughout the project.
 * - Keep major game flow here, and move detailed logic into other classes later.
 */
public class Game {

    private Scanner input;
    private Player player;
    private boolean running;

    /**
     * Constructs the game and prepares required resources.
     */
    public Game() {
        input = new Scanner(System.in);
        running = true;
    }

    /**
     * Starts the game loop.
     */
    public void start() {
        Utils.printHeader("Welcome to the Java EPIC Final Project");

        while (running) {
            displayMenu();
            int choice = Utils.readInt(input, "Enter your choice: ");

            switch (choice) {
                case 1:
                    createPlayer();
                    break;
                case 2:
                    chooseGameMode();
                    break;
                case 3:
                    viewPlayer();
                    break;
                case 4:
                    runPlaceholderAction();
                    break;
                case 5:
                    exitGame();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid menu option.");
            }
        }

        input.close();
    }

    /**
     * Displays the main menu.
     */
    private void displayMenu() {
        System.out.println();
        System.out.println("========== MAIN MENU ==========");
        System.out.println("1. Create Player");
        System.out.println("2. Choose Game Theme");
        System.out.println("3. View Player");
        System.out.println("4. Start Placeholder Action");
        System.out.println("5. Exit");
        System.out.println("================================");
    }

    /**
     * Creates a player if one does not already exist.
     */
    private void createPlayer() {
        if (player != null) {
            System.out.println("A player has already been created.");
            return;
        }

        String name = Utils.readNonEmptyString(input, "Enter your player name: ");
        player = new Player(name);

        System.out.println("Player created successfully.");
        System.out.println("Welcome, " + player.getName() + "!");
    }

    /**
     * Allows the user to choose a theme for the project.
     */
    private void chooseGameMode() {
        if (player == null) {
            System.out.println("Create a player first before choosing a theme.");
            return;
        }

        System.out.println();
        System.out.println("Choose your theme:");
        System.out.println("1. Fantasy Dungeon");
        System.out.println("2. Cyber Hacker");
        System.out.println("3. Space Explorer");

        int choice = Utils.readInt(input, "Enter your theme choice: ");

        switch (choice) {
            case 1:
                player.setGameMode(GameMode.FANTASY_DUNGEON);
                break;
            case 2:
                player.setGameMode(GameMode.CYBER_HACKER);
                break;
            case 3:
                player.setGameMode(GameMode.SPACE_EXPLORER);
                break;
            default:
                System.out.println("Invalid theme choice.");
                return;
        }

        System.out.println("Theme selected: " + player.getGameMode().getDisplayName());
    }

    /**
     * Displays current player information.
     */
    private void viewPlayer() {
        if (player == null) {
            System.out.println("No player has been created yet.");
            return;
        }

        Utils.printHeader("PLAYER INFO");
        System.out.println("Name: " + player.getName());
        System.out.println("Level: " + player.getLevel());
        System.out.println("Theme: " + (player.getGameMode() == null
                ? "Not selected"
                : player.getGameMode().getDisplayName()));
    }

    /**
     * Placeholder method students can replace with real features later.
     */
    private void runPlaceholderAction() {
        if (player == null) {
            System.out.println("Create a player first.");
            return;
        }

        System.out.println(player.getName() + " is getting ready for future missions...");
        System.out.println("This is a placeholder for later gameplay features.");
    }

    /**
     * Ends the game loop.
     */
    private void exitGame() {
        System.out.println("Exiting program. Thanks for playing.");
        running = false;
    }
}
