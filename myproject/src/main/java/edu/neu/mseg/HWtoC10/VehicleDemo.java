package edu.neu.mseg.HWtoC10;

// Abstract class representing a general Vehicle
abstract class Vehicle {
    String brand;
    String model;
    int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Abstract method for displaying vehicle information
    abstract void displayInfo();
}

// Concrete class representing a Car
class Car extends Vehicle {
    int numberOfDoors;

    // Constructor
    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Implementation of the abstract method
    @Override
    void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    // Additional method specific to cars
    void drive() {
        System.out.println("The car is now in motion.");
    }
}

// Concrete class representing a Motorbike
class Motorbike extends Vehicle {
    boolean hasSideCar;

    // Constructor
    public Motorbike(String brand, String model, int year, boolean hasSideCar) {
        super(brand, model, year);
        this.hasSideCar = hasSideCar;
    }

    // Implementation of the abstract method
    @Override
    void displayInfo() {
        System.out.println("Motorbike Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Has Sidecar: " + hasSideCar);
    }

    // Additional method specific to motorbikes
    void ride() {
        System.out.println("The motorbike is now in motion.");
    }
}

// Concrete class representing an Aircraft
class Aircraft extends Vehicle {
    int numberOfEngines;

    // Constructor
    public Aircraft(String brand, String model, int year, int numberOfEngines) {
        super(brand, model, year);
        this.numberOfEngines = numberOfEngines;
    }

    // Implementation of the abstract method
    @Override
    void displayInfo() {
        System.out.println("Aircraft Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Engines: " + numberOfEngines);
    }

    // Additional method specific to aircraft
    void fly() {
        System.out.println("The aircraft is now flying.");
    }
}

// Concrete class representing a Ship
class Ship extends Vehicle {
    String shipType;

    // Constructor
    public Ship(String brand, String model, int year, String shipType) {
        super(brand, model, year);
        this.shipType = shipType;
    }

    // Implementation of the abstract method
    @Override
    void displayInfo() {
        System.out.println("Ship Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Ship Type: " + shipType);
    }

    // Additional method specific to ships
    void sail() {
        System.out.println("The ship is now sailing.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        // Creating instances of different vehicles
        Car myCar = new Car("Toyota", "Camry", 2022, 4);
        Motorbike myMotorbike = new Motorbike("Harley-Davidson", "Sportster", 2021, true);
        Aircraft myAircraft = new Aircraft("Boeing", "747", 2019, 4);
        Ship myShip = new Ship("Royal Caribbean", "Symphony of the Seas", 2018, "Cruise Ship");

        // Displaying information and invoking specific methods
        myCar.displayInfo();
        myCar.drive();
        System.out.println();

        myMotorbike.displayInfo();
        myMotorbike.ride();
        System.out.println();

        myAircraft.displayInfo();
        myAircraft.fly();
        System.out.println();

        myShip.displayInfo();
        myShip.sail();
    }
}
