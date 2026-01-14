
import java.util.Scanner;

public class MaximumValueOfTheLoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        int weights = sc.nextInt();
        int [][]costAndWeights= new int [n][2];
        for(int i = 0; i < costAndWeights.length; i++){
            costAndWeights[i][0] = sc.nextInt();
            costAndWeights[i][1] = sc.nextInt();
        }
        for(int i = 0; i < costAndWeights.length; i++){
            for(int j = i+1; j < costAndWeights.length; j++){
                float pricePerOne =(float) costAndWeights[i][0] / costAndWeights[i][1];
                float pricePerTwo = (float) costAndWeights[j][0] / costAndWeights[j][1];
                if(pricePerTwo > pricePerOne){
                    int temp[] = new int[2];
                    temp[0] = costAndWeights[i][0];
                    temp[1] = costAndWeights[i][1];
                    costAndWeights[i] = costAndWeights[j];
                    costAndWeights[j] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            int take = minTake(weights, costAndWeights[i][1]);
            total = total + take *  ((double)costAndWeights[i][0] / costAndWeights[i][1]);
            weights = weights - take;
        }
        System.out.println(total);
    }
    public static int minTake(int weights, int weightOfItems){
        return Math.min(weights,weightOfItems);
    }
}
