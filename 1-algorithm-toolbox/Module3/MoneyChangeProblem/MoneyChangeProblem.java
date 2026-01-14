
import java.util.Scanner;

public class MoneyChangeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        while(n > 0) {
            if(n >= 10)
                n = n - 10;
             else if(n >= 5 )
                n = n - 5;
             else
                n = n - 1;
            sum++;
        }
        System.out.println(sum);
    }
}