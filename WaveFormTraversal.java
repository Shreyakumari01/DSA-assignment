import java.util.Scanner;

public class WaveFormTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        // Read matrix elements
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Wave Form Traversal
        for(int col = 0; col < m; col++) {
            if(col % 2 == 0) {
                // Top to Bottom
                for(int row = 0; row < n; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                // Bottom to Top
                for(int row = n - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
        sc.close();
    }
}