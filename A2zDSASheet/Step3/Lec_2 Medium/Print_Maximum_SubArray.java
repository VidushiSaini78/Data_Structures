public class practise {
    public static void main(String[] args) {
        int ar[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        print_Maximum_subarray(ar);
    }

    static void print_Maximum_subarray(int ar[]) {
        int sum = 0;
        int maxLength = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i < ar.length; i++) {
            if (sum == 0)
                start = i;
            sum += ar[i];
            if (sum > maxLength) {
                maxLength = sum;
                end = i;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("Maximum Sum SubArray :) ");
        for (int i = start; i <= end; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
