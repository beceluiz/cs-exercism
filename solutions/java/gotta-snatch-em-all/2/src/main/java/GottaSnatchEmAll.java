import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> collectionSet = new HashSet<>();
        
        for(String card : cards){
            collectionSet.add(card);
        }
        return collectionSet;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        for(String myCard : myCollection){
            if(myCollection.size() != theirCollection.size()){
                return false;
            }
            if(theirCollection.size() > 0 && myCollection.size() > 0 && !theirCollection.contains(myCard)) {
                return true;
            }
        }
        return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> listOfCommonCards = new HashSet<>(collections.get(0));
        
        for(Set<String>collection : collections){
            listOfCommonCards.retainAll(collection);
        }   
            return listOfCommonCards;
        }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>();
        
        for(Set<String> collection : collections){
            for(String card : collection){
                allCards.add(card);
            }
        }
        return allCards;
    }
}

