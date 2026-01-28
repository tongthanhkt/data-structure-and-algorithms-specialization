import java.util.Scanner;

public class LastDigitOfTheSumSquareFibonacci {
    static int lastDigitSumSquares(long n) {
        int period = 60;
        n %= period;
        int prev = 0;
        int curr = 1;
        if (n == 0)
            return 0;
        for (int i = 2; i <= n + 1; i++) {
            int next = (prev + curr) % 10;
            prev = curr;
            curr = next;
        }
        int Fn = prev;
        int F1 = curr;
        return (Fn * F1) % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(lastDigitSumSquares(n));
    }
}
