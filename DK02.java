import java.util.Scanner;

public class DK02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        System.out.println(Math.max(Math.max(a, b), c));
    }
}
