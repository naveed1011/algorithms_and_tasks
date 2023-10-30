package codemon;

public class FrostBite {
    // Properties of Frostbite
    private String name;
    private String TrainerID;
    private String appearance;
    private String habitat;
    private String[] strengths;
    private String[] weaknesses;
    private String[] diet;
    private String description;
    private String temperament;
    private String lifeDetails;

    public FrostBite(String name, String TrainerID, String appearance, String habitat, String[] strengths, String[] weaknesses, String[] diet, String description, String temperament, String lifeDetails) {
        this.name = name;
        this.TrainerID = TrainerID;
        this.appearance = appearance;
        this.habitat = habitat;
        this.strengths = strengths;
        this.weaknesses = weaknesses;
        this.diet = diet;
        this.description = description;
        this.temperament = temperament;
        this.lifeDetails = lifeDetails;
    }

    public void displayDetails() {
        // Display Frostbite's details
        System.out.println("Codémon Name: " + name);
        System.out.println("Trainer ID: " + TrainerID); // Display Trainer ID

        // Display ASCII art
        System.out.println("ASCII Art for " + name);
        System.out.println(appearance);

        System.out.println("Habitat: " + habitat);
        System.out.println("Strengths: " + String.join(", ", strengths));
        System.out.println("Weaknesses: " + String.join(", ", weaknesses));
        System.out.println("Diet: " + String.join(", ", diet));
        System.out.println("Description: " + description);
    }

    // Define some typical behaviors of Frostbite
    public void makeSound() {
        System.out.println(name + " makes a chilling, icy sound: grrrrrajjjjrrhhharrrr");
    }

    public void useIceAttack() {
        System.out.println(name + " uses its Ice Beam attack!");
    }

    // Display some typical behaviors of Frostbite
    public void displayBehaviors() {
        makeSound();
        useIceAttack();
    }

    // Display Monster Wiki entry for Frostbite
    public void displayMonsterWiki() {
        System.out.println("Temperament: " + temperament);
        System.out.println("Life Details: " + lifeDetails);
    }

    public static void main(String[] args) {
        // ASCII art representation of Frostbite's appearance
        String frostbiteArt =
            "        .--.\n" +
            "       |o_o |\n" +
            "       |:_/ |\n" +
            "      //   \\ \\\n" +
            "     (|     | )\n" +
            "    /'\\_   _/`\\\n" +
            "    \\___)=(___/";

        // Create a Frostbite object with all details
        String[] frostbiteStrengths = {"Ice Manipulation", "Cold Resistance"};
        String[] frostbiteWeaknesses = {"Fire", "Heat"};
        String[] frostbiteDiet = {"Frozen Vegetation", "Arctic Fish", "Icy Crystals"};
        String frostbiteDescription = "Frostbite is a majestic ice creature known for its frigid powers.";
        String frostbiteTemperament = "Calm and reserved";
        String frostbiteLifeDetails = "Frostbite thrives in extreme cold and often roams icy landscapes.";
        String TrainerID = "Codémon Trainer ID: xcAA2556";

        FrostBite frostbite = new FrostBite("Frostbite", TrainerID, frostbiteArt, "Frozen Tundras", frostbiteStrengths, frostbiteWeaknesses, frostbiteDiet, frostbiteDescription, frostbiteTemperament, frostbiteLifeDetails);

        // Display Codémon's details
        frostbite.displayDetails();

        // Display some typical behaviors of Frostbite
        frostbite.displayBehaviors();

        // Display Monster Wiki entry for Frostbite
        frostbite.displayMonsterWiki();
    }
}
