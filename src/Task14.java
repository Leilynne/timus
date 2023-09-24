import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;

        int[][] mas = new int[n][n];
        for (int i = 1; i <= n; i++){
            for(int z = 0; z < i; z++ ){
                mas[z][n-i+z] = count++;
            }
        }

        for (int i = n-1; i > 0; i--){
            for(int z = 0; z < i; z++){
                mas[n-i+z][z] = count++;
            }
        }
        for (int[] a: mas){
            for (int x : a) System.out.print(x+" ");
            System.out.println();
        }
    }
}
