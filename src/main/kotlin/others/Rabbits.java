package others;

import java.util.Scanner;

public class Rabbits {

    private final static String YES = "YES";
    private final static String NO = "NO";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cages = sc.nextInt();
        int rabbits = sc.nextInt();

        System.out.println(isValidPlacement(cages, rabbits));
    }

    private static String isValidPlacement(int cageNumber, int rabbitNumber) {

        int cnt = 0;
        int rabbitCounter = 0;

        while (cnt < cageNumber) {
            cnt++;
            rabbitCounter += cnt;
            if (rabbitCounter > rabbitNumber) {
                return NO;
            }
        }

        return YES;
    }
}
