import java.util.Scanner;

public class CarFueling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] stops = new int[n];
        for (int i = 0; i < stops.length; i++) {
            stops[i] = sc.nextInt();
        }
    }

    public static int minRefill(int d, int m, int[] stops) {
        int n = stops.length;
        int[] allStops = new int[n + 2];
        allStops[0] = 0;
        for (int i = 0; i < n; i++) {
            allStops[i + 1] = stops[i];
        }
        allStops[n + 1] = d;
        int numberRefills = 0;
        int current = 0;
        while (current < n + 1) {
            int last = current;
            while (current < n + 1 && allStops[current + 1] - allStops[last] <= m) {
                current++;
            }

            if (current == last) {
                return -1;
            }
        }
    }
}
