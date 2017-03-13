import java.util.*;

public class LCM {
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
	int gcd=gcd(a,b);
	long lcm= ((long)a*(long)b)/gcd;
    System.out.println(lcm);
  }
}
