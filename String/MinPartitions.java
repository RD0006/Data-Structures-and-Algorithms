public class MinPartitions {
    
    public int minPartitions(String n) {
        int max = 0;

        for (char i : n.toCharArray()) {
            max = Math.max(max, i - '0');
            if (max == 9) return max;
        }

        return max;
    }
    
}
