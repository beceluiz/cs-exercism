public class Twofer {
    public String twofer(String name) {
        String client = (name == null || name.isEmpty()) ? "you" : name;
        
          return "One for " + client + ", one for me.";
        
    }
}
