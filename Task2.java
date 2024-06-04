import java.util.*;

public class Task2 {
    
    static int maximumImpactFactor(double S, double P[], int F[], int n)
    {
        int capacity = (int) Math.round(S * 100);

        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = (int) Math.round((1-P[i]) * 100);
        }

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + F[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ans = new ArrayList<Integer>();

        int t = sc.nextInt();

        while(t-- > 0) {
            int N = sc.nextInt();

            double P[] = new double[N];

            for(int i=0; i<N; i++)
                P[i] = sc.nextDouble();

            int F[] = new int[N];

            for(int i=0; i<N; i++)
                F[i] = sc.nextInt();

            double S = sc.nextDouble();

            ans.add(maximumImpactFactor(S, P, F, N));
        }

        sc.close();

        for(int i=0; i<ans.size(); i++)
            System.out.println("Case "+(i+1)+": "+ans.get(i));
    }
}
