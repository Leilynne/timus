import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt();
        int mid = scanner.nextInt();
        int max = scanner.nextInt();

        if (mid < 2){
            System.out.println(min - max -  mid);
        } else {
            System.out.println(min - mid * max);
        }
    }
}
