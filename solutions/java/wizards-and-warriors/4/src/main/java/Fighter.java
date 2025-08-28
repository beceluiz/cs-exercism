class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable(){
        return false;
    }

    public String toString(){
        return "Fighter is a Warrior";
    }
    @Override
    public int getDamagePoints(Fighter fighter){
       int damage = 0;
       return fighter.isVulnerable() ?  10 :  6;
    }
    
}

class Wizard extends Fighter {
    boolean isSpellPrepared = false;
    
   
    public String toString(){
        return "Fighter is a Wizard";
    }

    public void prepareSpell(){
        isSpellPrepared = true;
    }
    
    @Override
    boolean isVulnerable(){
        return isSpellPrepared ? false : true;
    }
    
    @Override
    public int getDamagePoints(Fighter fighter){
        return isSpellPrepared ? 12 : 3;
    }
    
}
