package View;

// Imports go here

import java.util.ArrayList;

// This is the Title
public class World {

    // these are class variables
    private ArrayList<Road> roads = new ArrayList<>();
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private ArrayList<TrafficLights> trafficLights = new ArrayList<>();

    // This is a default constructor
    public World(int numRoads) {
        for (int i = 0; i < numRoads; ++i) {
            Road tempRoad = new Road(i);
            roads.add(tempRoad);
            // First
            if (i == 0) {
                continue;
                // Last
            } else if (i == numRoads - 1) {
                tempRoad.previous_road = roads.get(i - 1);
                // Middle
            } else {
                tempRoad.previous_road = roads.get(i - 1);
                roads.get(i - 1).next_road = tempRoad;
            }
        }
        addVehicle();

    }

    private void addVehicle() {
        Vehicle blueCar = new Vehicle(roads.get(0));
        roads.get(5).vehicle = blueCar;
        blueCar.moveCar();
        vehicles.add(blueCar);
    }

    // This is a non-default constructor
    // public World( ) {

    // }

    // methods


    // getters and setters

    public ArrayList<Road> getRoads() {
        return roads;
    }

    public void setRoads(ArrayList<Road> roads) {
        this.roads = roads;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<TrafficLights> getTrafficLights() {
        return trafficLights;
    }

    public void setTrafficLights(ArrayList<TrafficLights> trafficLights) {
        this.trafficLights = trafficLights;
    }
}
