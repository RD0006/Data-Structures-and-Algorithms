public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int cnt = 0, check = 0;

        for (char i : s.toCharArray()) {
            if (i == 'L') check--;
            else check++;

            if (check == 0) cnt++;
        }

        return cnt;
    }
}
