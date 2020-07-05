import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String getValue = scanner.nextLine();
        for (int i = 2; i >= 0; i--) {
            if (getValue.charAt(i) == '0' && i == 2) {
                continue;
            } else {
                System.out.print(getValue.charAt(i));
            }
        }
    }
}
