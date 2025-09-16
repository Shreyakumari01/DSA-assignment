import java.util.Scanner;

public class PatternMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char pattern = sc.next().charAt(0);
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];
        int value = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = value++;
            }
        }

        int[][] result = new int[N][N];
        int sum = 0;

        switch (pattern) {
            case 'D':
                for (int i = 0; i < N; i++) {
                    result[i][0] = matrix[i][0];
                    sum += matrix[i][0];
                }
                break;
            case 'R':
                for (int j = 0; j < N; j++) {
                    result[N-1][j] = matrix[N-1][j];
                    sum += matrix[N-1][j];
                }
                break;
            case 'U':
                for (int i = 0; i < N; i++) {
                    result[i][N-1] = matrix[i][N-1];
                    sum += matrix[i][N-1];
                }
                break;
            case 'X':
                for (int i = 0; i < N; i++) {
                    result[i][i] = matrix[i][i];
                    sum += matrix[i][i];
                }
                break;
            default:
                System.out.println("Invalid pattern character.");
                return;
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(result[i][j]);
                if (j != N - 1) System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println(sum);
    }
}