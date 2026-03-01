"""
Score of a String
Maximum Substrings with Distinct Start
Final Value of Variable After Performing Operations
Find Words Containing Character
Minimum Number of Operations to Move All Balls to Each Box
Defanging an IP Address
Jewels and Stones
Reverse String Prefix
Find Most Frequent Vowel and Consonant
Convert Date to Binary
"""

import java.util.HashSet;

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
}