import java.util.*;

public class GCD {
  private static int gcd(int a, int b) {
  if(a==0)
			return b;

      if(a>=b)
  		return gcd(a%b,b);
  		else
  		return gcd(b,a);


  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd(a, b));
  }
}
