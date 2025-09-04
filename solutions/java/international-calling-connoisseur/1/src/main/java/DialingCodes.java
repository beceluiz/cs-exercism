import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DialingCodes {
        Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codes;    
    }

    public void setDialingCode(Integer code, String country) {
        codes.put(code,country);
    }

    public String getCountry(Integer code) {
        return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!codes.containsKey(code) && !codes.containsValue(country)){
            codes.put(code,country);
        }
    }

    public Integer findDialingCode(String country) {   
        Set<Integer> keys = new HashSet<>(codes.keySet());
        for(Integer key : keys){
            String countryOfDialingCode = codes.get(key);
            if(countryOfDialingCode.equals(country)){
                return key;
            }
    }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(codes.containsValue(country)){
                int formerCode = findDialingCode(country);
                codes.remove(formerCode);
                codes.put(code, country);
        }
    
    }
}
