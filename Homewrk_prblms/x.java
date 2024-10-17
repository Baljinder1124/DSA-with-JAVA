package Homewrk_prblms;

public class x {
    public static void main(String[] args) {
        int n = 5; // This determines the size of the butterfly.

        // Upper half of the butterfly
        for (int i = 0; i <= n; i++) {
            // Left side
            for (int j = 0; j <= n; j++) {
                if (j == 0 || j == i) { // Print stars at the beginning and the diagonal
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print spaces in between
                }
            }
            // Right side
            for (int j = 0; j <= n; j++) {
                if (j == n || j == n - i) { // Print stars at the end and the diagonal
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print spaces in between
                }
            }
            System.out.println();
        }
        for (int i = n; i >=0;  i--) {
            // Left side
            for (int j = 0; j <= n; j++) {
                if (j == 0 || j == i) { // Print stars at the beginning and the diagonal
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print spaces in between
                }
            }
            // Right side
            for (int j = 0; j <= n; j++) {
                if (j == n || j == n - i) { // Print stars at the end and the diagonal
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print spaces in between
                }
            }
            System.out.println();
        }
    }
}
