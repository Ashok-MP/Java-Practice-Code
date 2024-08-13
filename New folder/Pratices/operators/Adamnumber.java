
import java.util.Scanner;

public class Adamnumber {

    public static int Square(int a) {
        return a * a;
    }

    public static int reverse(int a) {
        int rev = 0;
        while (a != 0) {
            int b = a % 10;
            rev = rev * 10 + b;
            a /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int a_pow = Square(a);
        int a2 = reverse(a);
        int a2_pow = Square(a2);
        int a2_rev = reverse(a2_pow);
        if (a2_rev == a_pow) {
            System.out.println("adam");
        } else {
            System.out.println("null");
        }
        s.close(); 
}
}
