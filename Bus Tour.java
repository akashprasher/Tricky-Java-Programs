import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int noBridge = scanner.nextInt();
        int obstacleHeight = 1;
        int obstacleBridge = 1; 
        boolean obstacle = false;
        for (int i = 0; i < noBridge; i++) {
            obstacleHeight = scanner.nextInt();
            if (obstacleHeight > busHeight) {
                continue;
            } else if (obstacleHeight <= busHeight && !obstacle) {
               obstacle = true;
               obstacleBridge = i + 1;
            }
        }
        if (obstacle) {
            System.out.println("Will crash on bridge " + obstacleBridge);
        } else if (!obstacle) {
            System.out.println("Will not crash");
        }
        
    }
}
