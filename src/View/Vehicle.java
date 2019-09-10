package View;

// Imports go here

// This is the Title
public class Vehicle {

    // these are class variables
    private Road carRoad;

    // This is a non-default constructor
    Vehicle(Road carRoad) {
        this.carRoad = carRoad;
    }

    // methods
    void moveCar() {
        for (int i = 0; i < 40; ++i) {
            if (carRoad.canGo) {
                carRoad.next_road.vehicle = this;
                carRoad.vehicle = null;
                this.carRoad = this.carRoad.next_road;
                System.out.println("Vehicle has moved to Road Position " + carRoad.roadPosition);
            }
        }
    }

    // getters and setters

    public Road getCarRoad() {
        return carRoad;
    }

    public void setCarRoad(Road carRoad) {
        this.carRoad = carRoad;
    }
}
