public class MinOperations {
    
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
