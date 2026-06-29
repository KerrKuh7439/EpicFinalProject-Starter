public class Student extends GameCharacter {

    private String house;

    public Student(String name, int level, String house) {

        super(name, level);
        this.house = house;

    }

    public String getHouse() {

        return house;

    }

    public void setHouse(String house) {

        this.house = house;

    }

    @Override
    public void performSpecialAbility() {

        System.out.println(name + " proudly represents " + house + " House!");

        switch (house) {

            case "Gryffindor":
                System.out.println("Special Ability: Sword of Gryffindor Strike!");
                break;

            case "Hufflepuff":
                System.out.println("Special Ability: Loyal Defense!");
                break;

            case "Ravenclaw":
                System.out.println("Special Ability: Ancient Knowledge!");
                break;

            case "Slytherin":
                System.out.println("Special Ability: Serpent's Cunning!");
                break;

            default:
                System.out.println("Special Ability: Basic Spell!");

        }

    }

}