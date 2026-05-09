public class ReverseDegree {
    
    public int reverseDegree(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            res += (i + 1) * (26 - s.charAt(i) + 'a');
        }

        return res;
    }

}
