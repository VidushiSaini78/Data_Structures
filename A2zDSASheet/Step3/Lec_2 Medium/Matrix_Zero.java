import java.util.Arrays;

public class practise {
    public static void main(String[] args) {
        int ar[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        method3(ar);
        //method1(ar);
        //method2(ar);
    }

    // Brute Force TC: O(N*M) for traversing O(N+M) for replacing for -1
    static void method1(int ar[][]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == 0) {
                    // Making entire row element equal to -1
                    for (int k = 0; k < ar.length; k++) {
                        if (ar[k][j] != 0)
                            ar[k][j] = -1;
                    }
                    // Making entire column element equal to -1
                    for (int k = 0; k < ar[i].length; k++) {
                        if (ar[i][k] != 0)
                            ar[i][k] = -1;
                    }
                }
            }

        }
        System.out.println("Displaying the final output -> ");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == -1)
                    ar[i][j] = 0;
            }
            System.out.println(Arrays.toString(ar[i]));
        }
    }

    // Better Approach TC : O(N^2) + O(N^2) SC: O(N+M)
    static void method2(int ar[][]) {
        int row[] = new int[ar.length];
        int column[] = new int[ar[0].length];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i][j] == 0) {
                    row[i] = -1;
                    column[j] = -1;
                    break;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (row[i] == -1 || column[j] == -1)
                    ar[i][j] = 0;
            }
        }
        display(ar);

    }

    static void display(int ar[][]) {
        System.out.println("Displaying the final output -> ");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }

    }
    // Optimized TC : O(N) SC:O(1)
    static void method3(int ar[][]) {
        int col0 = 1;
        /*
         * int column[] = ar[i][..]
         * int row[] = ar[..][j]
         */
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == 0) {
                    // making that row 0
                    ar[i][0] = 0;
                    // making that column 0
                    if (j != 0)
                        ar[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }
        for (int i = 1; i < ar.length; i++) {
            for (int j = 1; j < ar[i].length; j++) {
                if (ar[i][j] != 0) {
                    if (ar[0][j] == 0 || ar[i][0] == 0)
                        ar[i][j] = 0;
                }
            }
        }
        if (ar[0][0] == 0) {
            for (int i = 0; i < ar[0].length; i++) {
                ar[0][i] = 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < ar.length; i++) {
                ar[i][0] = 0;
            }
        }
        display(ar);
    }

}
