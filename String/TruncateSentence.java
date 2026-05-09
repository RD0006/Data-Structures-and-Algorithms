public class TruncateSentence {
    
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
    
}
