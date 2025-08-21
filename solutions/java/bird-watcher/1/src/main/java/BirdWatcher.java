
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeekCopy = {0,2,5,3,7,8,4};
        return lastWeekCopy;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        // for(int i = 0; i < birdsPerDay.length; i++) {
        //     if(birdsPerDay[i] == 0) { return true; };
        // }
        for(int bird: birdsPerDay){
            if(bird == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int counter = 0;
        int days = numberOfDays < 7 ? numberOfDays : 7;
        
        for(int i = 0; i < days; i++) {
            counter += birdsPerDay[i];
         }
        return counter;
    }

    public int getBusyDays() {
        int counter = 0;
        for(int busyday: birdsPerDay){
            if(busyday >= 5) counter++;
        }

        return counter;
    }
}
