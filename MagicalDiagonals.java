import java.util.Scanner;

public class MagicalDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int mainDiag = 0;
        int secDiag = 0;

        for (int i = 0; i < N; i++) {
            mainDiag += matrix[i][i];
            secDiag += matrix[i][N - 1 - i];
        }

        System.out.println(mainDiag + " " + secDiag);
    }
}