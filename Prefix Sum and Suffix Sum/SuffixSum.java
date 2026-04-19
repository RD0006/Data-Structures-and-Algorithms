class SuffixSum {
    static int[] suffixSum(int [] arr) {
        int n = arr.length;

        if (n == 0) return new int[n];

        int [] suffix = new int[n];

        suffix[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }

        return suffix;
    }

    public static void main(String [] args) {
        int [] arr = {2, 4, 6, 8, 10};
        int [] suffix = suffixSum(arr);

        System.out.print("\nElements: ");
        for (int i : suffix) System.out.print(i + " ");
        System.out.println();
    }
}