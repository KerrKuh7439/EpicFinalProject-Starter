import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    private boolean running = true;

    // Store Player objects
    private ArrayList<Player> players = new ArrayList<>();

    // Inventory object
    private Inventory inventory = new Inventory();

    public void startGame() {

        while (running) {

            displayMenu();

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    createPlayer();
                    break;

                case 2:
                    viewPlayers();
                    break;

                case 3:
                    startAdventure();
                    break;

                case 4:
                    viewInventory();
                    break;

                case 5:
                    exitGame();
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        input.close();
    }

    // Display menu
    private void displayMenu() {

        System.out.println("\n===== MAIN MENU =====");
        System.out.println("1. Create Player");
        System.out.println("2. View Players");
        System.out.println("3. Start Adventure");
        System.out.println("4. View Inventory");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    // Create player
    private void createPlayer() {

        input.nextLine();

        System.out.print("Enter player name: ");
        String name = input.nextLine();

        Player player = new Player(name, 1);

        players.add(player);

        System.out.println("Player created successfully!");
    }

    // View players
    private void viewPlayers() {

        if (players.isEmpty()) {

            System.out.println("No players have been created.");
            return;
        }

        System.out.println("\n===== PLAYER LIST =====");
        System.out.println("Total Players: " + players.size());

        for (Player player : players) {

            System.out.println("----------------------");
            System.out.println("Name: " + player.getName());
            System.out.println("Level: " + player.getLevel());
        }
    }

    // Adventure
    private void startAdventure() {

        if (players.isEmpty()) {

            System.out.println("Create a player before starting your adventure.");
            return;
        }

        Player player = players.get(0);

        System.out.println("\n===== ADVENTURE =====");
        System.out.println(player.getName() + " enters the Dark Forest...");

        Enemy goblin = new Enemy("Goblin", 25);

        System.out.println("A wild " + goblin.getName() + " appears!");
        System.out.println("Enemy Health: " + goblin.getHealth());

        // Give player starter sword only once
        if (!inventory.hasItem("Wooden Sword")) {

            Item starterItem = new Item("Wooden Sword", 10);

            inventory.addItem(starterItem);

            System.out.println(player.getName() + " found a Wooden Sword!");
        }

        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1. Attack");
        System.out.println("2. Run Away");
        System.out.print("Choice: ");

        int action = input.nextInt();

        if (action == 1) {

            System.out.println();
            System.out.println(player.getName() + " attacks the Goblin!");
            System.out.println("The Goblin has been defeated!");
            System.out.println(player.getName() + " earned 50 experience!");
            System.out.println();
            System.out.println("Congratulations! You survived your first adventure!");
            System.out.println("You safely return to town.");

        } else if (action == 2) {

            System.out.println();
            System.out.println(player.getName() + " decided the Goblin looked too dangerous.");
            System.out.println("You escaped safely.");
            System.out.println("Maybe you'll be braver next time!");

        } else {

            System.out.println();
            System.out.println("You hesitated...");
            System.out.println("The Goblin wandered off into the forest.");
        }

    }

    // View inventory
    private void viewInventory() {

        inventory.displayItems();
    }

    // Exit game
    private void exitGame() {

        System.out.println();
        System.out.println("Thank you for playing!");
        System.out.println("See you on your next adventure!");

        running = false;
    }

}