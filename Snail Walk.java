import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Using algebric formula. We can also implement using some another method, it's it easiest one.
        System.out.println((h - b - 1) / (a - b) + 1);
    }
}
