// Inheritance: Vehicle and Car
// Question:
// Create a Vehicle class with attributes for make and model.
// create a subclass Car that adds the attribute number of doors. 
// Demonstrate creating a Car object and displaying its details.
class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Doors: " + numberOfDoors);
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 4);
        myCar.displayDetails();
    }
}
