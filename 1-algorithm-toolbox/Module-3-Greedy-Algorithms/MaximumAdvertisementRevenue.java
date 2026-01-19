import java.util.Arrays;
import java.util.Scanner;

public class MaximumAdvertisementRevenue {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] clicks = new int[n];
        int [] prices = new int[n];

        for( int i = 0; i <n; i++) {
            clicks[i] = sc.nextInt();
        }
     
        for( int i = 0; i <n; i++) {
            prices[i] = sc.nextInt();
        }
        Arrays.sort(clicks);
        Arrays.sort(prices);
        long total = 0;
        for(int i = 0; i < n; i++) {
            total += (long)clicks[i] * prices[i];
        }
        System.out.println(total);
    }
}
