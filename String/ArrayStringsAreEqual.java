public class ArrayStringsAreEqual {
    
    public boolean arrayStringsAreEqual(String [] word1, String [] word2) {
        String word_1 = "";
        String word_2 = "";

        for (String word : word1) word_1 += word;

        for (String word : word2) word_2 += word;

        return word_1.equals(word_2);
    }

}
