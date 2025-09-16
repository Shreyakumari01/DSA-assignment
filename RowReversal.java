import java.util.Scanner;

public class RowReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = M - 1; j >= 0; j--) {
                System.out.print(matrix[i][j]);
                if (j != 0) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
