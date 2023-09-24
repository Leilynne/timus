import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] mas = new int[n][n];
    for(int i = 0; i<n; i++){
        for(int z = 0; z< n; z++){
            mas[i][z] = scanner.nextInt();
        }
    }
    for(int i = 0; i < n; i++){
        for(int z = i; z>=0; z--){
            System.out.print(mas[z][i-z] + " ");
        }
    }
    for(int i = n-1; i > 0; i--){
        for(int z = 1; z <= i; z++){
            System.out.print(mas[n-z][n-i-1+z] + " ");
        }
    }
}
}
