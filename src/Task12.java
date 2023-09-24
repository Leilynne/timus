import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextLine().trim();
        }

        char ch = scanner.next().charAt(0);

        for(int i = 0; i < n; i++){
            if(ch == arr[i].charAt(0)){
                System.out.println(arr[i]);
            }
        }
    }
}
