public class MostWordsFound {
    
    public int mostWordsFound(String[] sentences) {
        int res = 0;

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            res = Math.max(res, words.length);
        }

        return res;
    }
    
}
