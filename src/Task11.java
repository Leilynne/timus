import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task11 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Set<String> set = new HashSet<>();
    int n = scanner.nextInt() + 1;

    for (int i = 0; i < n; i++) {
        set.add(scanner.nextLine());
    }
    if (n == set.size()) {
        System.out.println(0);
    } else {
        int count = set.size();
        count -= n;
        System.out.println(Math.abs(count));
    }
}
}
