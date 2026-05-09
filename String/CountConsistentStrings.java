import java.util.HashSet;

public class CountConsistentStrings {

    public int countConsistentStrings(String allowed, String [] words) {
        int cnt = 0;

        HashSet<Character> hs = new HashSet<>();

        for (char c : allowed.toCharArray()) hs.add(c);

        for (String word : words) {
            boolean valid = true;

            for (char i : word.toCharArray()) {
                if (!hs.contains(i)) {
                    valid = false;
                    break;
                }
            }

            if (valid) cnt++;
        }

        return cnt;
    }

}
