import java.util.Scanner;

public class SUM1 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      in.close();
      long sum = 0;
      for(int i = 1; i <= n; i++){
        sum += i;
      }
      System.out.println(sum);
    }
}
