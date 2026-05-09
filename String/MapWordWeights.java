public class MapWordWeights {
    
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
