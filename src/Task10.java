import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String name;
        int ep = 0;
        int mp = 0;
        int lp = 0;
        while (n>=0){
            name = scanner.nextLine();
            n--;
            switch (name) {
                case "Emperor Penguin":
                    ep++ ;
                    break;
                case "Macaroni Penguin":
                    mp++;
                    break;
                case "Little Penguin":
                    lp++;
                    break;
            }
        }
        if ((ep > mp) && (ep > lp)){
            System.out.println("Emperor Penguin");
        }
        else if ((mp > ep) && (mp > lp)){
            System.out.println("Macaroni Penguin");
        }
        else if ((lp> ep) && (lp > mp)){
            System.out.println("Little Penguin");
        }
    }
}
