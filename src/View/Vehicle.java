package View;

// Imports go here

// This is the Title
public class Vehicle {

    // these are class variables
    private Road carRoad;

    // This is a non-default constructor
    public Vehicle(Road carRoad) {
        this.carRoad = carRoad;
    }

    // methods
    public void moveCar (int spacesMoved) {
        for(int i = 0; i < spacesMoved; ++i){
            carRoad.next_road.vehicle = this;
            carRoad.vehicle = null;
            this.carRoad = this.carRoad.next_road;
            System.out.println("Vehicle has moved to Road Position " + carRoad.roadPosition);
        }
    }

    // getters and setters

}
