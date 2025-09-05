public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character){
        String charClass = character.getCharacterClass();
        int charLvl = character.getLevel();
        int charHitPoints = character.getHitPoints();
        
        return String.format("You're a level %d %s with %d hit points.",
                             charLvl, charClass, charHitPoints);
    }
    
    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination){
        String name = destination.getName();
        int inhabitants = destination.getInhabitants();

        return String.format("You've arrived at %s, which has %d inhabitants."
                            ,name,inhabitants);
    }
    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod travelMethod){
        String method = "";

        switch(travelMethod){
                case WALKING:
                method = "by walking";
                break;
            case HORSEBACK:
                method = "on horseback";
                break;
        }
        return String.format("You're traveling to your destination %s."
                             ,method);
    }
    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod travelMethod){
        String c = describe(character);
        String t = describe(travelMethod);
        String d = describe(destination);
        return String.format("%s %s %s", c,t,d);
    }
    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination){
        String c = describe(character);
        String d = describe(destination);
        String m = describe(TravelMethod.WALKING);
        return String.format("%s %s %s", c, m, d);
    }
}
