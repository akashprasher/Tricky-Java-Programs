import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int finalCount = 0;
        int maxCount = 1;
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraySize - 1; i++) {
            if (array[i] < array[i + 1]) {
                maxCount++;
                if (finalCount < maxCount) {
                    finalCount = maxCount;
                }
            } else {
                maxCount = 1;
            }  
        }
        if (finalCount == 0) {
            System.out.println("1");
        } else {
            System.out.println(finalCount);
        }
    }
}
