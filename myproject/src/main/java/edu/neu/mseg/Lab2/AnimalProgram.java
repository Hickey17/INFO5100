package edu.neu.mseg.Lab2;

class Animal {
    String name;
    String size;
    String weight;
    String diet;

    public Animal(String name, String size, String weight, String diet) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.diet = diet;
    }

    public void displayInfo() {
        System.out.println(name + " - Size: " + size + ", Weight: " + weight + ", Diet: " + diet);
    }
}

class Bird extends Animal {
    String speciesName;
    String wingspan;

    public Bird(String name, String size, String weight, String diet, String speciesName, String wingspan) {
        super(name, size, weight, diet);
        this.speciesName = speciesName;
        this.wingspan = wingspan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Species: " + speciesName + ", Wingspan: " + wingspan);
    }
}

class LandAnimal extends Animal {
    int numLegs;

    public LandAnimal(String name, String size, String weight, String diet, int numLegs) {
        super(name, size, weight, diet);
        this.numLegs = numLegs;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Legs: " + numLegs);
    }
}

class Fish extends Animal {
    int numFins;

    public Fish(String name, String size, String weight, String diet, int numFins) {
        super(name, size, weight, diet);
        this.numFins = numFins;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Fins: " + numFins);
    }
}

public class AnimalProgram {
    public static void main(String[] args) {
        Bird birdExample = new Bird("Eagle", "Large", "4 kg", "Predator", "Aquila chrysaetos", "7 feet");
        LandAnimal landAnimalExample = new LandAnimal("Lion", "Large", "200 kg", "Predator", 4);
        Fish fishExample = new Fish("Salmon", "Medium", "2 kg", "Vegetarian", 2);

        birdExample.displayInfo();
        System.out.println();
        landAnimalExample.displayInfo();
        System.out.println();
        fishExample.displayInfo();
    }
}

