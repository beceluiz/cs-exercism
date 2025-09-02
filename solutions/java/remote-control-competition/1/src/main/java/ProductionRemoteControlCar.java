class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTraveled = 0;
    private int numberOfVictories = 0;
    
    public void drive() {
        distanceTraveled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTraveled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
    
    @Override
    public int compareTo(ProductionRemoteControlCar anotherCar) {
        return Integer.compare(anotherCar.getNumberOfVictories(), this.getNumberOfVictories());
    }

    
}
