import java.util.HashSet;

public class MaxDistinct {
    
    public int maxDistinct(String s) {
        
        HashSet<Character> h = new HashSet<>();

        for (char i : s.toCharArray()) 
            h.add(i);
        
        return h.size();
    }

}
