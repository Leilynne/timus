import java.util.Scanner;

public class Task3 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += scanner.nextInt();
    }
    if ((sum - n) / 2 % 2 != 0) {
        System.out.println("Daenerys");
    } else {
        System.out.println("Stannis");
    }
}
}
