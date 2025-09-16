import java.util.List;
import java.util.Random;
import java.util.ArrayList;

class DnDCharacter {
    Random rand = new Random();
    int strength = ability(rollDice());
    int dexterity = ability(rollDice());
    int constitution = ability(rollDice());
    int intelligence = ability(rollDice());
    int wisdom = ability(rollDice());
    int charisma = ability(rollDice());
    int hitPoints = 10;
    
    
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
        double result = (input - 10.0) / 2.0;
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
