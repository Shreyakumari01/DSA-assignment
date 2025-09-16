import java.util.Scanner;

public class RoyalTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int maxSum = Integer.MIN_VALUE;
        int winnerIndex = -1;

        for (int i = 0; i < N; i++) {
            int teamSum = 0;
            for (int j = 0; j < M; j++) {
                teamSum += sc.nextInt();
            }

            if (teamSum > maxSum) {
                maxSum = teamSum;
                winnerIndex = i;
            }

        }

        System.out.println(winnerIndex);
    }
}