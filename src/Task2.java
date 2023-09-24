import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;

        for(int i = 0; i < n; i++){
            int num = scanner.nextInt();
            sum+= num;
            if(num<4){
                System.out.println("None");
                return;
            }
        }
        if(sum/n==5.0){
            System.out.println("Named");
        } else if (sum/n >= 4.5){
            System.out.println("High");
        } else if(sum/n<4.5){
            System.out.println("Common");
        }
    }
}
