public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double producedCars = 221.0;
         if(speed > 0 && speed < 5) {
            return speed * producedCars;
        } else if (speed > 4 && speed < 9) {
            return (speed * producedCars) * 0.9;
        } else if (speed == 9) {
            return (speed * producedCars) * 0.8;
        } else if (speed == 10){
            return (speed * producedCars) * 0.77;
        }

        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        int producedCars = 221;
         if(speed > 0 && speed < 5) {
            return (speed * producedCars) / 60;
        } else if (speed > 4 && speed < 9) {
            return (int)(((speed * producedCars) * 0.9) / 60);
        } else if (speed == 9) {
            return (int)(((speed * producedCars) * 0.8) / 60);
        } else if (speed == 10){
            return (int)(((speed * producedCars) * 0.77) / 60);
        }
        return 0;
    }
    }
