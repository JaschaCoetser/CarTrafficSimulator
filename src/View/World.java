package View;

// Imports go here

import java.util.ArrayList;

// This is the Title
public class World {

    // these are class variables
    private ArrayList<Road> roads = new ArrayList<>();

    // This is a default constructor
    public World() {
        for (int i = 0; i < 5; ++i) {
            Road tempRoad = new Road();
            roads.add(tempRoad);
            // First
            if (i == 0) {
                continue;
                // Last
            } else if (i == 4) {
                tempRoad.previous_road = roads.get(i - 1);
            // Middle
            } else {
                tempRoad.previous_road = roads.get(i - 1);
                roads.get(i - 1).next_road = tempRoad;
//                tempRoad.next_road = roads.get(i + 1);
            }
        }
    }

    // This is a non-default constructor
    // public World( ) {

    // }

    // methods


    // getters and setters

}
