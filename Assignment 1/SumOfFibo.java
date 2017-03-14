import java.util.*;

public class SumOfFibo {
    private static int getLastDigit(long n){

      int len=  (int)(n%300);
      
      if(len==0 || len==1){
        return len;
      }
      else{
      int f[]=new int[len+1];
      int s[]=new int[len+1];
      f[0]=s[0]=0;
      f[1]=s[1]=1;
      for(int i=2;i<=len;i++){
        f[i]=(f[i-1]+f[i-2])%10;
        s[i]=(s[i-1]+f[i])%10;
      }
      return s[len];
    }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int ans= getLastDigit(n);
        System.out.println(ans);
    }
}
