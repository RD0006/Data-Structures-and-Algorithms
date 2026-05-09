public class ReversePrefix {
    
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
    
}
