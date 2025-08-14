public class Lasagna {
    int minutes = 40;
    
    public int expectedMinutesInOven() {
        return minutes;
    }
    public int remainingMinutesInOven(int minutes) {
        return 40 - minutes;
    }
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    public int totalTimeInMinutes(int layers, int minutes){
        return minutes + (layers * 2);
    }
}
