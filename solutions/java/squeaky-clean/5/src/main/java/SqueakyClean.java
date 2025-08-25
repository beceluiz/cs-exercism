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
    }

}