import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] names = new char[n];
        int count = 0;
        int pos = 1;

        for (int i = 0; i < n; i++) {
            char na = scanner.next().toCharArray()[0];
            names[i] = na;
        }

        for (int i = 0; i < n; i++) {
            if (names[i] == 'A' || names[i] == 'P' || names[i] == 'O' || names[i] == 'R') {
                if (pos == 2) {
                    count++;
                    pos = 1;
                } else if (pos == 3) {
                    count += 2;
                    pos = 1;
                }
            }
            else if (names[i] == 'B' || names[i] == 'M' || names[i] == 'S') {
                if (pos == 1) {
                    count++;
                    pos = 2;
                } else if (pos == 3) {
                    count ++;
                    pos = 2;
                }
            }

            else if (names[i] == 'D' || names[i] == 'G' || names[i] == 'K' || names[i] == 'T' || names[i] == 'W' || names[i] == 'J') {
                if (pos == 1) {
                    count += 2;
                    pos = 3;
                } else if (pos == 2) {
                    count++;
                    pos = 3;
                }
            }

        }
        System.out.println(count);

    }
}
