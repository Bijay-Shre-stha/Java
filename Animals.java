// Parent class Animal
class Animal {
    String species;
    String habitat;

    // Constructor
    Animal(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }
}

// Child class Mammal
class Mammal extends Animal {
    int numberOfLegs;
    String sound;

    // Constructor
    Mammal(String species, String habitat, int numberOfLegs, String sound) {
        super(species, habitat);
        this.numberOfLegs = numberOfLegs;
        this.sound = sound;
    }

    // Method to display Mammal details
    void display() {
        System.out.println("Species: " + species);
        System.out.println("Habitat: " + habitat);
        System.out.println("Number of Legs: " + numberOfLegs);
        System.out.println("Sound: " + sound);
        System.out.println();
    }
    void eat(){

    }
}

// Child class NonMammal
class NonMammal extends Animal {
    boolean isColdBlooded;
    String locomotionType;

    // Constructor
    NonMammal(String species, String habitat, boolean isColdBlooded, String locomotionType) {
        super(species, habitat);
        this.isColdBlooded = isColdBlooded;
        this.locomotionType = locomotionType;
    }

    // Method to display Non-Mammal details
    void display() {
        System.out.println("Species: " + species);
        System.out.println("Habitat: " + habitat);
        System.out.println("Cold Blooded: " + isColdBlooded);
        System.out.println("Locomotion Type: " + locomotionType);
        System.out.println();
    }
}

public class Animals {
    public static void main(String[] args) {
        // Creating objects of child classes and assigning values
        Mammal dog = new Mammal("Dog", "Land", 4, "Bark");
        NonMammal snake = new NonMammal("Snake", "Land", true, "Slither");

        // Printing values
        System.out.println("Mammal:");
        dog.display();

        System.out.println("Non-Mammal:");
        snake.display();
    }
}
