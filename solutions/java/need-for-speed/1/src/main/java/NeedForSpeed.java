class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int meters = 0;
    private int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public int getBatteryDrain(){
        return this.batteryDrain;
    }
    

    public boolean batteryDrained() {
        return battery < 1 || batteryDrain > battery;
    }

    public int distanceDriven() {
        return meters;
    }

    public void drive() {
        if(!batteryDrained()){
         meters += speed;
         battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        int nitroSpeed = 50;
        int nitroBatteryDrain = 100 * 4 / 100;
        NeedForSpeed n = new NeedForSpeed(nitroSpeed, nitroBatteryDrain);
        return n;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int battery = 100;
        while(battery > 0){
            car.drive();
            battery -= car.getBatteryDrain();
        }
        return car.distanceDriven() >= distance;
    }
}
