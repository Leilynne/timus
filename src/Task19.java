import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder s = new StringBuilder();
        if (n == 1) s.append(1);
        if (n == 0) s.append("01");
        while (n > 1) {
            for (int i = 9; i > 0; i--){
                if (i == 1){
                    System.out.println(-1);
                    return;
                }
                if (((double) n/i)%1 == 0) {
                    s.append(i);
                    n /= i;
                    break;
                }
            }
        }
        System.out.println(s.reverse());
    }
}
