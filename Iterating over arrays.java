import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] mainArray = new int[arraySize];
        int n;
        int m;
        boolean result = false;
        for (int i = 0; i < arraySize; i++) {
            mainArray[i] = scanner.nextInt();
        }
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int x = 0; x < arraySize; x++) {
            if (x + 1 != arraySize && mainArray[x] == n && mainArray[x + 1] == m) {
                result = true;
            } else if (x + 1 != arraySize && mainArray[x] == m && mainArray[x + 1] == n) {
                result = true;
            }
        }
        System.out.println(result);
    }
}
