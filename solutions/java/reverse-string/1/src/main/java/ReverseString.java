class ReverseString {

    String reverse(String inputString) {
        int length = inputString.length();
        String reversed = "";
        if(!inputString.isEmpty()){
            for(int i= length; i > 0; i--){
            reversed += inputString.charAt(i-1);
        } 
        }
       
        return reversed;
    }
  
}
