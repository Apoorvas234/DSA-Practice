import java.util.*;

public class PrefixSuffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();

        boolean prefix = true;
        boolean suffix = true;

        // Check prefix
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) != T.charAt(i)) {
                prefix = false;
                break;
            }
        }

        // Check suffix
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) != T.charAt(M - N + i)) {
                suffix = false;
                break;
            }
        }

        if (prefix && suffix) {
            System.out.println(0);
        } else if (prefix) {
            System.out.println(1);
        } else if (suffix) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}