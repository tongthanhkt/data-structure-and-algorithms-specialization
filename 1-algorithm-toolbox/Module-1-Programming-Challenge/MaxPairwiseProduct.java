package MaxPairwiseProduct;
import java.io.*;
import java.util.*;
public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        int max1 = -1;
        int max2 = -1;
        for(int num: numbers) {
            if(num > max1) {
                max2 = max1;
                 max1 = num;
            } else if(num > max2){
                max2 = num;
            }
        }
        return (long)max1 * max2;
        
    }
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int numbers[] = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner(InputStream stream){
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

         String next() {
            while(st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }   catch(IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();         
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}