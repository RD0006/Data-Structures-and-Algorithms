class LCS {

    static int longestCommonSubsequence(int [] x, int [] y, int m, int n) {
        int [][] t = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) t[i][j] = 0;
            }
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (x[i - 1] == y[j - 1]) 
                    t[i][j] = 1 + t[i - 1][j - 1];
                else 
                    t[i][j] = Math.max(
                        t[i][j - 1],
                        t[i - 1][j]
                    );
            }
        }

        return t[m][n];
    }

    static int longestCommonSubstring(String x, String y, int m, int n) {
        int [][] t = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++){
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) 
                    t[i][j] = 0;
            }
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) 
                    t[i][j] = 1 + t[i - 1][j - 1];
                else t[i][j] = Math.max(
                    t[i][j - 1],
                    t[i - 1][j]
                );
            }
        }

        return t[m][n];
    }

    public static void main(String [] args) {
        // int [] x = {1, 3, 2, 4, 5, 6, 7, 8};
        // int [] y = {1, 2, 5, 6, 7, 4, 8};
        // System.out.println(longestCommonSubsequence(x, y, x.length, y.length));

        String x = "abcdfr";
        String y = "abcfrd";
        System.out.println(longestCommonSubstring(x, y, x.length(), y.length()));
    }

}