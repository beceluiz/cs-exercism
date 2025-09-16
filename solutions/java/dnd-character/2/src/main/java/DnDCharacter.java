import java.util.List;
import java.util.Random;
import java.util.ArrayList;

class DnDCharacter {
    Random rand = new Random();
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;
    int hitPoints;

    public DnDCharacter(){
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.hitPoints = 10;
    }
    
    int ability(List<Integer> scores) {
        List<Integer> scoresClone = new ArrayList<>(scores);
        int result = 0;
        scoresClone.sort((a,b) -> a - b);
        scoresClone.remove(0);

        for(Integer score : scoresClone){
                result += score;
            }
        return result;
    }

    List<Integer> rollDice() {
        List<Integer> scores = new ArrayList<>();

        for(int i =0; i < 4; i++){
            int randomInt = rand.nextInt(1,7);
            scores.add(randomInt);
        }
        return scores;
    }

    int modifier(int input) {
        double result = (input - hitPoints) / 2.0;
        return (int) Math.floor(result);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return hitPoints + modifier(getConstitution());
    }
}
