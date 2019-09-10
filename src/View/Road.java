package View;

public class Road {
    Vehicle vehicle;
    Road previous_road;
    Road next_road;
    int roadPosition;

    public Road(int roadPosition) {
        this.roadPosition = roadPosition;
    }

//    public Road(Road previous_road, Road next_road) {
//        this.previous_road = previous_road;
//        this.next_road = next_road;
//    }
}
