import java.util.Scanner;

public class lcm {
    static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return a / (gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        System.out.println(lcm(a, b));
    }
}
