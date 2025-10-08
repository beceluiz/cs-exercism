class Darts {
     double totalArea(double radio){
            return radio * radio;
        }
    
    int score(double xOfDart, double yOfDart) {
        int result = 0;
        double outerCircle = 10.0;
        double innerCircle = 1.0;
        double middleCircle = 5.0;
   
        double distance = (xOfDart * xOfDart) + (yOfDart * yOfDart);
        
        if(distance <= totalArea(innerCircle)){
            result = 10;
        } else if(distance <= totalArea(middleCircle)){
            result = 5;
        } else if(distance <= totalArea(outerCircle)){
            result = 1;
        }
        return result;
    }
}
