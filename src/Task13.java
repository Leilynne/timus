import java.util.Scanner;

public class Task13 {    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int h= scanner.nextInt();
    int l = scanner.nextInt();

    System.out.println(((h + l) -1) - h);
    System.out.print(((h + l) -1) - l);
}
}
