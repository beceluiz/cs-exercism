class SqueakyClean {
    static String clean(String identifier) {
            String modify = "";
    
            // replace whitespaces for underscores
            modify = identifier.replaceAll(" ", "_").replaceAll("4","a")
                .replaceAll("3","e").replaceAll("0","o")
                .replaceAll("1","l").replaceAll("7","t");

            // convert kebab-case to camelCase
            String camel = "";
            for(int i = 0; i < modify.length(); i++) {
                if(modify.charAt(i) == '-') {
                    String newChar = modify.charAt(i+1) + "";
                    camel += newChar.toUpperCase();
                    i++;
                } else{
                camel += modify.charAt(i);
                }
        
        }

        String onlyLetters = "";

        for(int i = 0;  i < camel.length(); i++) {
            if(Character.isLetter(camel.charAt(i)) || camel.charAt(i) == '_'){
                String newChar = camel.charAt(i) + "";
                onlyLetters += newChar;
            }
        }
        
        
        return onlyLetters;

        

    }

}