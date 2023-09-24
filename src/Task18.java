import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for(int i = 0; i < k/2+1; i++){
            sum+=arr[i]/2+1;
        }
        System.out.println(sum);
    }
}
