public class MaxFreqSum {
    
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

}
