import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widhtNoTittle = scanner.nextInt();
        int tittle = scanner.nextInt();
        int numberPartStart = scanner.nextInt();
        int numberPartStop = scanner.nextInt();

        int res = 0;

        if (numberPartStart < numberPartStop){
            res = tittle*(numberPartStop-numberPartStart)*2+ widhtNoTittle*(numberPartStop-1-numberPartStart);
        } else if(numberPartStart>numberPartStop){
            res = tittle*(numberPartStart-numberPartStop)*2 + widhtNoTittle*((numberPartStart-numberPartStop)+1);
        } else {
            res = widhtNoTittle;
        }
        System.out.println(res);
    }
}
