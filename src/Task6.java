import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                sum += i;
            } else {
                sum -= i;
            }
        }
        System.out.println(sum%2==0 ? "black" : "grimy");
    }
}
