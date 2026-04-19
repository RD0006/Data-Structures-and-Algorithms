class Example {
    static int MaxSumOfSubarray(int [] arr, int n, int k) {
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        int window_sum = 0;

        for (int i = 0; i < k; i++) {
            window_sum += arr[i];
        }

        int max_sum = window_sum;

        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);    
        }

        return max_sum;
    }

    public static void main(String [] args) {
        int [] arr = {5, 2, -1, 0, 3};
        int n = arr.length;
        int k = 3;

        int result = MaxSumOfSubarray(arr, n, k);
        System.out.println("\nResult: " + result);
    }
}