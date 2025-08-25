class SqueakyClean {
    static String clean(String identifier) {
                char lastChar = ' ';
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < identifier.length(); i++){
                    char actualChar = identifier.charAt(i);

                    if(lastChar != '-' ) {
                        // replace any spaces encountered with underscores
                    if(Character.isSpaceChar(actualChar) || identifier.isEmpty()){
                        sb.append("_");
                    } else if(actualChar == '-') {
                        String nextChar = identifier.charAt(i+1) + "";
                        sb.append(nextChar.toUpperCase());
                        // to skip the next char since we already add it on the line above
                    } else if(Character.isDigit(actualChar)){
                        if (actualChar == '4') { sb.append("a"); }
                        else if(actualChar == '3') {sb.append("e");}
                        else if(actualChar == '0') {sb.append("o");}
                        else if(actualChar == '1') {sb.append("l");}
                        else if(actualChar == '7') {sb.append("t");}
                    } else if (Character.isLetter(identifier.charAt(i))){
                        sb.append(identifier.charAt(i));
                    }
                    }
                    

                    lastChar = actualChar;
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