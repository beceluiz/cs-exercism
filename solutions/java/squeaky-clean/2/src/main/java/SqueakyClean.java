class SqueakyClean {
    static String clean(String identifier) {

                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < identifier.length(); i++){
                    // replace any spaces encountered with underscores
                    if(identifier.charAt(i) == ' ' || identifier.isEmpty()){
                        sb.append("_");
                    } else if(identifier.charAt(i) == '-') {
                        String nextChar = identifier.charAt(i+1) + "";
                        sb.append(nextChar.toUpperCase());
                        // to skip the next char since we already add it on the line above
                        i++;
                    } else if(Character.isDigit(identifier.charAt(i))){
                        if (identifier.charAt(i) == '4') { sb.append("a"); }
                        else if(identifier.charAt(i) == '3') {sb.append("e");}
                        else if(identifier.charAt(i) == '0') {sb.append("o");}
                        else if(identifier.charAt(i) == '1') {sb.append("l");}
                        else if(identifier.charAt(i) == '7') {sb.append("t");}
                    } else if (Character.isLetter(identifier.charAt(i))){
                        sb.append(identifier.charAt(i));
                    }
                    
                }
                return sb.toString();

        
        //     String modify = "";
    
        //     // replace whitespaces for underscores
        //     modify = identifier.replaceAll(" ", "_").replaceAll("4","a")
        //         .replaceAll("3","e").replaceAll("0","o")
        //         .replaceAll("1","l").replaceAll("7","t");

        //     // convert kebab-case to camelCase
        //     String camel = "";
        //     for(int i = 0; i < modify.length(); i++) {
        //         if(modify.charAt(i) == '-') {
        //             String newChar = modify.charAt(i+1) + "";
        //             camel += newChar.toUpperCase();
        //             i++;
        //         } else{
        //         camel += modify.charAt(i);
        //         }
        
        // }

        // String onlyLetters = "";

        // for(int i = 0;  i < camel.length(); i++) {
        //     if(Character.isLetter(camel.charAt(i)) || camel.charAt(i) == '_'){
        //         String newChar = camel.charAt(i) + "";
        //         onlyLetters += newChar;
        //     }
        // }
        
        
        // return onlyLetters;

        

    }

}