import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LastDigitOfFibonacciNumber {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    static long calculateFibonacci(int n) {
        long prev = 0;
        long curr = 1;
        if (n <= 1)
            return n;
        for (int i = 2; i <= n; i++) {
            long next = (prev + curr) % 10;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    static long calculateLastDigitFibonacci(int n) {
        long number = calculateFibonacci(n);
        return number % 10;

    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calculateLastDigitFibonacci(n));
    }
}
