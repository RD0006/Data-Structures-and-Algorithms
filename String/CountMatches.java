import java.util.List;

public class CountMatches {
    
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;

        int x = ruleKey.equals("type") ? 0 : (ruleKey.equals("color") ? 1 : 2);

        for (List<String> item : items) {
            if (item.get(x).equals(ruleValue)) cnt++;
        }

        return cnt++;
    }

}
