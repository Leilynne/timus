import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextLine().trim().length();
        int res = 1;


        int i;
        for (i = n; i > 0; i -= s) {
            res *= i;
        }
        System.out.println(res);
    }
}
