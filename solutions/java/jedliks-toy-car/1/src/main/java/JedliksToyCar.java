public class JedliksToyCar {
    public int battery = 100;
    public int meters = 0;
    
    public boolean hasFuel() {
        return battery > 0;
}
    
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        String metersDriven = String.format("Driven %s meters", meters);
        return metersDriven;
    }

    public String batteryDisplay() {
        if(!hasFuel()){
            return "Battery empty";
        }
        return "Battery at "+ battery + "%";
    }

    public void drive() {
        if(hasFuel()){
        battery -= 1;
        meters += 20;
        } 
    }
}
