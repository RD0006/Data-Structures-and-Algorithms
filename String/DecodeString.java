import java.util.HashMap;

public class DecodeString {

        public String decodeString(String key, String message) {
        HashMap<Character, Character> hm = new HashMap<>();

        char chr = 'a';

        for (char x : key.toCharArray()) {
            if (x != ' ' && !hm.containsKey(x)) hm.put(x, chr++);
            if (hm.size() == 26) break;
        }

        char [] decoded = new char[message.length()];

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') decoded[i] = ' ';
            else decoded[i] = hm.get(message.charAt(i));
        }

        return new String(decoded);
    }
    
}
