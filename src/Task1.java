import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        long res = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);

        for(int i = n-1; i>=0; i--){
            res += sum*arr[i];
            sum-= arr[i];
            res+=sum*arr[i];
        }
        System.out.println(res);
    }
}
