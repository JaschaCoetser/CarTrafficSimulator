package View;

// Imports go here

import java.util.ArrayList;

// This is the Title
public class World {

    // these are class variables
    private ArrayList<Road> roads = new ArrayList<>();

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
        Vehicle blueCar = new Vehicle(roads.get(0));
        roads.get(5).vehicle = blueCar;
        blueCar.moveCar(5);

    }

    // This is a non-default constructor
    // public World( ) {

    // }

    // methods


    // getters and setters

}
