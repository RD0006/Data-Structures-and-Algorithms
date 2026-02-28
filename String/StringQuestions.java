"""
Score of a String
Maximum Substrings with Distinct Start
Final Value of Variable After Performing Operations
Find Words Containing Character
Minimum Number of Operations to Move All Balls to Each Box
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
}