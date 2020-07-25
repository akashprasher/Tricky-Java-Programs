import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int start = 0;
        int yep;
        int ans = 0;

        while (start < len) {
            yep = scanner.nextInt();
            start++;

            if (yep % 4 == 0 && yep > ans) {
                ans = yep;
            }
        }

        System.out.println(ans);
    }
}
