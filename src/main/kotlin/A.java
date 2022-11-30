import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long k = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        if((a + b) % k == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
