import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    private boolean running = true;

    // Stores all playable characters
    private ArrayList<GameCharacter> players = new ArrayList<>();

    // Inventory
    private Inventory inventory = new Inventory();

    // Starts the game
    public void startGame() {
    	
    	System.out.println("====================================");
    	System.out.println("      WIZARDING WORLD GAME");
    	System.out.println("====================================");
    	System.out.println("Welcome, young Witch or Wizard!");
    	System.out.println("Choose your path, and begin your magical adventure!");
    	System.out.println();

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
                    System.out.println("Invalid choice. Please try again.");

            }

        }

        input.close();

    }

    // Main Menu
    private void displayMenu() {

        System.out.println();
        System.out.println("====================================");
        System.out.println("      WIZARDING WORLD");
        System.out.println("====================================");
        System.out.println("1. Create Witch or Wizard");
        System.out.println("2. View Characters");
        System.out.println("3. Begin Adventure");
        System.out.println("4. View Inventory");
        System.out.println("5. Exit Game");
        System.out.print("Enter your choice: ");

    }

    // Create Character
    private void createPlayer() {

        input.nextLine();

        System.out.print("\nEnter your character's name: ");
        String playerName = input.nextLine();

        System.out.println();
        System.out.println("Choose your path:");
        System.out.println("1. Hogwarts Student");
        System.out.println("2. Auror");
        System.out.print("Choice: ");

        int type = input.nextInt();
        input.nextLine();

        GameCharacter character;

        if (type == 1) {

            System.out.println();
            System.out.println("Choose your Hogwarts House:");
            System.out.println("1. Gryffindor");
            System.out.println("2. Hufflepuff");
            System.out.println("3. Ravenclaw");
            System.out.println("4. Slytherin");
            System.out.print("Choice: ");

            int houseChoice = input.nextInt();

            String house;

            switch (houseChoice) {

                case 1:
                    house = "Gryffindor";
                    break;

                case 2:
                    house = "Hufflepuff";
                    break;

                case 3:
                    house = "Ravenclaw";
                    break;

                default:
                    house = "Slytherin";
                    break;

            }

            character = new Student(playerName, 1, house);

        } else {

            System.out.println();
            System.out.println("Choose your Auror mentor:");
            System.out.println("1. Harry Potter");
            System.out.println("2. Kingsley Shacklebolt");
            System.out.println("3. Nymphadora Tonks");
            System.out.println("4. Alastor Moody");
            System.out.print("Choice: ");

            int mentorChoice = input.nextInt();

            String mentor;

            switch (mentorChoice) {

                case 1:
                    mentor = "Harry Potter";
                    break;

                case 2:
                    mentor = "Kingsley Shacklebolt";
                    break;

                case 3:
                    mentor = "Nymphadora Tonks";
                    break;

                default:
                    mentor = "Alastor Moody";
                    break;

            }

            character = new Auror(playerName, 1, mentor);

        }

        players.add(character);

        System.out.println();
        System.out.println("Character created successfully!");
        System.out.println("Name: " + character.getName());

        if (character instanceof Student) {

            Student student = (Student) character;
            System.out.println("Class: Hogwarts Student");
            System.out.println("House: " + student.getHouse());

        } else if (character instanceof Auror) {

            Auror auror = (Auror) character;
            System.out.println("Class: Auror");
            System.out.println("Mentor: " + auror.getMentor());

        }

    }
    // View all created characters
    private void viewPlayers() {

        if (players.isEmpty()) {

            System.out.println("\nNo characters have been created yet.");
            return;

        }

        System.out.println();
        System.out.println("========== CHARACTER LIST ==========");

        for (GameCharacter player : players) {

            System.out.println("------------------------------------");
            System.out.println("Name: " + player.getName());
            System.out.println("Level: " + player.getLevel());

            if (player instanceof Student) {

                Student student = (Student) player;

                System.out.println("Class: Hogwarts Student");
                System.out.println("House: " + student.getHouse());

            }

            else if (player instanceof Auror) {

                Auror auror = (Auror) player;

                System.out.println("Class: Auror");
                System.out.println("Mentor: " + auror.getMentor());

            }

            player.performSpecialAbility();
            System.out.println();

        }

    }

    // Start the adventure
    private void startAdventure() {

        if (players.isEmpty()) {

            System.out.println("\nCreate a character before starting an adventure.");
            return;

        }

        GameCharacter player = players.get(0);

        System.out.println();
        System.out.println("====================================");
        System.out.println("        THE FORBIDDEN FOREST");
        System.out.println("====================================");

        System.out.println(player.getName() + " enters the Forbidden Forest...");

        Enemy spider = new Enemy("Acromantula", 50, 15);

        System.out.println();
        System.out.println("A wild " + spider.getName() + " appears!");
        System.out.println("Enemy Health: " + spider.getHealth());
        System.out.println("Enemy Attack: " + spider.getAttackPower());

        if (!inventory.hasItem("Magic Wand")) {

            inventory.addItem(new Item("Magic Wand", 100));

            System.out.println();
            System.out.println(player.getName() + " found a Magic Wand!");

        }

        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1. Cast Spell");
        System.out.println("2. Run Away");
        System.out.print("Choice: ");

        int action = input.nextInt();

        if (action == 1) {

            System.out.println();

            player.performSpecialAbility();

            System.out.println("The spell was super effective!");
            
            System.out.println();
            System.out.println(player.getName() + " defeats the " + spider.getName() + "!");
            System.out.println("You gained 50 experience!");
            System.out.println("Congratulations! You survived your adventure!");
            System.out.println("You safely return to Hogwarts.");

        }

        else if (action == 2) {

            System.out.println();
            System.out.println(player.getName() + " escaped safely.");
            System.out.println("Maybe you'll be braver next time!");

        }

        else {

            System.out.println();
            System.out.println("You hesitated...");
            System.out.println("The " + spider.getName() + " disappeared into the forest.");

        }

    }

    // Display inventory
    private void viewInventory() {

        inventory.displayItems();

    }

    // Exit the game
    private void exitGame() {

    	System.out.println("====================================");
    	System.out.println("Thank you for playing");
    	System.out.println("Wizarding World!");
    	System.out.println("May your wand always serve you well.");
    	System.out.println("See you on your next adventure!");
    	System.out.println("====================================");

        running = false;

    }

}