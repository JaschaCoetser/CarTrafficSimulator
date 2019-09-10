package View;

public class Road {
    Vehicle vehicle;
    Road previous_road;
    Road next_road;
    int roadPosition;
    boolean canGo = true;
    private TrafficLights trafficLights;

    Road(int roadPosition) {
        this.roadPosition = roadPosition;
    }

//    public Road(Road previous_road, Road next_road) {
//        this.previous_road = previous_road;
//        this.next_road = next_road;
//    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Road getPrevious_road() {
        return previous_road;
    }

    public void setPrevious_road(Road previous_road) {
        this.previous_road = previous_road;
    }

    public Road getNext_road() {
        return next_road;
    }

    public void setNext_road(Road next_road) {
        this.next_road = next_road;
    }

    public int getRoadPosition() {
        return roadPosition;
    }

    public void setRoadPosition(int roadPosition) {
        this.roadPosition = roadPosition;
    }

    public boolean isCanGo() {
        return canGo;
    }

    public void setCanGo(boolean canGo) {
        this.canGo = canGo;
    }

    public TrafficLights getTrafficLights() {
        return trafficLights;
    }

    public void setTrafficLights(TrafficLights trafficLights) {
        this.trafficLights = trafficLights;
    }
}
