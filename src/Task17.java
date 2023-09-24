import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task17 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
        String s = scanner.next();
        String[] moves = {"a1", "a2", "b1", "b2", "c1", "d2"};
        Set<String> setMoves = new HashSet<>(Arrays.asList(moves));
        char[] coord = s.toCharArray();
        if (coord[0] == 'a' || coord[0] == 'h') setMoves.removeAll(Arrays.asList("a1", "a2", "b1", "d2"));
        else if (coord[0] == 'b' || coord[0] == 'g') setMoves.removeAll(Arrays.asList("a1", "a2"));
        if (coord[1] == '1' || coord[1] == '8') setMoves.removeAll(Arrays.asList("a2", "b1", "b2", "c1"));
        else if (coord[1] == '2' || coord[1] == '7') setMoves.removeAll(Arrays.asList("b1", "b2"));
        System.out.println(setMoves.size()+2);
    }
}
}
