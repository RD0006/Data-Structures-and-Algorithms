"""
1. Score of a String
2. Maximum Substrings with Distinct Start
3. Final Value of Variable After Performing Operations
4. Find Words Containing Character
5. Minimum Number of Operations to Move All Balls to Each Box
6. Defanging an IP Address
7. Jewels and Stones
8. Reverse String Prefix
9. Find Most Frequent Vowel and Consonant
10. Convert Date to Binary
11. Partitioning into Minimum Number of Deci-Binary Numbers
12. Reverse Degree of a String
13. Count the Number of Consistent Strings
14. Goal Parser Interpretation
15. Permutation Difference between Two Strings
16. Split a String in Balanced Strings
17. Remove Outermost Parentheses
18. Encode and Decode TinyURL
19. Reverse Prefix of Word
20. Check if Two String Arrays are Equivalent
21. Decode the Message
22. Shuffle String
23. Count Items Matching a Rule
24. Weighted Word Mapping
"""

import java.util.HashSet;
import java.util.HashMap;

public class StringQuestions {
    
    public int scoreOfString(String s) {

        int result = 0;

        for (int i = 0; i < s.length() - 1; i++) 
            result += Math.abs(s.charAt(i) - s.charAt(i + 1));

        return result;
    }

    public int maxDistinct(String s) {
        
        HashSet<Character> h = new HashSet<>();

        for (char i : s.toCharArray()) 
            h.add(i);
        
        return h.size();
    }

    public int finalValueAfterOperations(String [] operations) {

        int x = 0;

        for (String operation : operations) {
            if (oepration.equals("X++") || operation.equals("++X"))
                x++;
            else
                x--;
        }

        return x;
    }

    public List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) 
                result.add(i);
        }

        return result;
    }

    public int[] minOperations(String boxes) {

        int balls = 0, moves = 0, n = boxes.length();

        int [] result = new int[n];

        for (int i = 0; i < n; i++) {
            moves += balls;
            result[i] += moves;
            balls += boxes.charAt(i) == '1' ? 1 : 0;
        }

        moves = 0;
        balls = 0;

        for (int i = 0; i < n; i++) {
            moves += balls;
            result[i] += moves;
            balls += boxes.charAt(i) == '1' ? 1 : 0;
        }

        return result;
    }

    public String defangIPAddr(String address) {
        StringBuffer sb = new StringBuffer();

        for (char i : address.toCharArray()) {
            if (i == '.') 
                sb.append("[.]");
            else
                sb.append(i);
        }

        return sb.toString();
    }

    public int numJewelsInStones(String jewels, String stones) {

        int cnt = 0; 

        for (stone: stones.toCharArray()) 
            if (jewels.indexOf(stone) != -1) 
                cnt++;

        return cnt;
    }

    public String reversePrefix(String s, int k) {
        char [] arr = s.toCharArray();

        for (int i = 0; i < k / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[k - i - 1];
            arr[k - i - 1] = temp;
        }

        return new String(arr);
    }

    public int maxFreqSum(String s) {
        int [] arr = new int[26];

        int a = 'a';

        for (int i = 0; i < s.length(); i++)
            arr[s.charAt(i) - a]++;

        int max_v = 0;
        int max_c = 0;

        for (int i = 0; i < 26; i++) {
            if (i == 'a' - a || i == 'e' - a || i == 'i' - a || i == 'o' - a || i == 'u' - i) {
                if (max_v > arr[i]) max_v = arr[i];
            }
            else {
                if (max_c > arr[i]) max_c = arr[i];
            }
        }

        return max_v + max_c;
    }

    public String convertDateToBinary(String date) {
        String [] date_split = date.split("-");

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 3; i++) {
            sb.append(Integer.toBinaryString(Integer.parseInt(date_split[i])));
            if (i != 2) sb.append("-");
        }

        return sb.toString();
    }

    public int minPartitions(String n) {
        int max = 0;

        for (char i : n.toCharArray()) {
            max = Math.max(max, i - '0');
            if (max == 9) return max;
        }

        return max;
    }

    public int reverseDegree(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            res += (i + 1) * (26 - s.charAt(i) + 'a');
        }

        return res;
    }

    public int countConsistentStrings(String allowed, String [] words) {
        int cnt = 0;

        HashSet<Character> hs = new HashSet<>();

        for (char c : allowed) hs.add(c);

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

    public String interpret(String command) {
        StringBuffer sb = new StringBuffer(command);

        String res = "";

        int i = 0;
        while (i < sb.length()) {
            if (sb.charAt(i) == 'G') {
                res += "G";
                i++;
            }
            
            else if (sb.substring(i, i + 2).equals("()")) {
                res += "o";
                i += 2;
            }

            else {
                res += "l";
                res += 4;
            }
        }

        return res;
    }

    public int findPermutationDifference(String s, String t) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            res += Math.abs(i - t.indexOf(s.charAt(i)));
        }

        return res;
    }

    public int balancedStringSplit(String s) {
        int cnt = 0, check = 0;

        for (char i : s.toCharArray()) {
            if (i == 'L') check--;
            else check++;

            if (check == 0) cnt++;
        }

        return cnt;
    }

    public String removeOutermostParentheses(String s) {
        StringBuffer sb = new StringBuffer();

        int check = 0;

        for (char i : s.toCharArray()) {
            if (i == '(' && check++ > 0) sb.append(i);
            else if (i == ')' && check-- > 1) sb.append(i);
        }

        return sb.toString();
    }

    public int mostWordsFound(String[] sentences) {
        int res = 0;

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            res = Math.max(res, words.length);
        }

        return res;
    }

    public String truncateSentence(String s, int k) {
        String [] words = s.split(" ");

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < k; i++) {
            sb.append(words[i]);

            if (i != k - 1) 
                sb.append(" ");
        }

        return sb.toString();
    }

    public class Codec { 

        HashMap<Integer, String> hm = new HashMap<>();

        int cnt = 1;

        private static final String base = "http://tinyurl.com/abcd";

        public String encode(String longUrl) {
            String tinyUrl = base + cnt;

            hm.put(cnt++, longUrl);

            return tinyUrl;
        }

        public String decode(String shortUrl) {
            return hm.get(
                Integer.parseInt(
                    shortUrl.substring(shortUrl.indexOf('d') + 1, shortUrl.length());
                )
            );
        }
    }

    public String reversePrefix(String word, char ch) {
        int x = word.indexOf(ch) + 1;

        char [] arr = word.toCharArray();

        for (int i = 0; i < x / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[x - i - 1];
            arr[x - i - 1] = temp;
        }

        return new String(arr);
    }

    public boolean arrayStringsAreEqual(String [] word1, String [] word2) {
        String word_1 = "";
        String word_2 = "";

        for (String word : word1) word_1 += word;

        for (String word : word2) word_2 += word;

        return word_1.equals(word_2);
    }

    public String decodeString(String key, String message) {
        HashMap<Character, Character> hm = new HashMap<>();

        char chr = 'a';

        for (char x : key.toCharArray()) {
            if (x != ' ' && !hm.contains(x)) hm.put(x, chr++);
            if (hm.size() == 26) break;
        }

        char [] decoded = new char[messgae.length()];

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') decoded[i] = ' ';
            else decoded[i] = hm.get(message.charAt(i));
        }

        return new String(decoded);
    }

    public String restoreString(String s, int [] indices) {
        char [] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[indices[i]] = s.charAt(i);
        }

        return new String(arr);
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;

        int x = ruleKey.equals("type") ? 0 : (ruleKey.equals("color") ? 1 : 2);

        for (List<String> item : items) {
            item.get(x).equals(ruleValue) cnt++;
        }

        return cnt++;
    }

    public String mapWordWeights(String [] words, int [] weights) {
        char [] arr = new char[words.length];

        for (int i = 0; i < words.length; i++) {
            int sum = 0;

            for (char x : words[i].toCharArray()) sum += weights[x - 'a'];

            arr[i] = (char)('a' + (25 - sum % 26));
        }

        return new String(arr);
    }
}