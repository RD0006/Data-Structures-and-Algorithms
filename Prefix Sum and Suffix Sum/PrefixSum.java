class PrefixSum {
    static int[] prefixSum(int [] arr) {
        int n = arr.length;

        if (n == 0) return new int[n];
        
        int [] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        
        return prefix;
    }

    public static void main(String [] args) {
        int [] arr = {2, 4, 6, 8, 10};
        int [] prefix = prefixSum(arr);

        System.out.print("\nElements: ");
        for (int i : prefix) System.out.print(i + " ");
        System.out.println();
    }
}