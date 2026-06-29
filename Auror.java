public class Auror extends GameCharacter {

    private String mentor;

    public Auror(String name, int level, String mentor) {

        super(name, level);
        this.mentor = mentor;

    }

    public String getMentor() {

        return mentor;

    }

    public void setMentor(String mentor) {

        this.mentor = mentor;

    }

    @Override
    public void performSpecialAbility() {

        System.out.println(name + " was trained by " + mentor + ".");

        switch (mentor) {

            case "Harry Potter":
                System.out.println("Special Ability: Expelliarmus!");
                break;

            case "Kingsley Shacklebolt":
                System.out.println("Special Ability: Patronus Blast!");
                break;

            case "Nymphadora Tonks":
                System.out.println("Special Ability: Metamorphmagus Surprise!");
                break;

            case "Alastor Moody":
                System.out.println("Special Ability: Constant Vigilance!");
                break;

            default:
                System.out.println("Special Ability: Stunning Spell!");
                break;

        }

    }

}