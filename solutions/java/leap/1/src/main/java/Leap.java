class Leap {

    boolean isLeapYear(int year) {
        // boolean isDivisibleByFour =  year % 4;
        // boolean isDivisibleByHundred = year % 100;
        // boolean isDivisibleByFourHundred =  year % 400;


        if(year % 4 == 0) {
            if(year % 100 == 0){
                if(year % 400 == 0){
                return true;
                }
                return false;
            }
            return true;
        }

        return false;
    }

}
