import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == 5) {
                a++;
            } else if (array[i] == 4) {
                b++;
            } else if (array[i] == 3) {
                c++;
            } else if (array[i] == 2) {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}
