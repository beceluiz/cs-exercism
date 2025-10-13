import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class HighScores {
    List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size() - 1);
    }

    Integer personalBest() {
        int best = highScores.get(0);
        for(Integer score : highScores){
            if(score > best) best = score; 
        }
        return best;
    }

    List<Integer> personalTopThree() {
        
        List<Integer> sortedList = new ArrayList<>(highScores);
       sortedList.sort(Comparator.reverseOrder());

        if(sortedList.size() <= 2){
            return sortedList;
        } 
        List<Integer> top3 = sortedList.subList(0,3);
        
        return top3;
    }

}
