import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] aArray = new int[arraySize];
        int resultCount = 0;
        for (int i = 0; i < arraySize; i++) {
            aArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraySize - 2; i++) {
            if (aArray[i + 1] == aArray[i] + 1 && aArray[i + 2] == aArray[i] + 2) {
                resultCount++;
            }
        }
        System.out.println(resultCount);
    }
}
