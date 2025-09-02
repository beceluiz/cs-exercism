public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distanceTraveled = 0;
    
    public void drive() {
        distanceTraveled += 20;
    }

    public int getDistanceTravelled() {
        return distanceTraveled;
    }
}
