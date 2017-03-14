import java.util.*;

public class FiboModM {


    private static int getPisanoPeriod(long n, long m) {

      if(n==0 || n==1){
        return (int)n;
      }
      long maxLength= m*6;

      int f[]= new int[(int)maxLength+1];
      f[0]=0;
      f[1]=1;
      int cnt=0;
      for(int i=2;i<=(int)maxLength;i++){
        f[i]= (f[i-1]%(int)m+f[i-2]%(int)m)%(int)m;

      }
      int i=0;
      int flag=0;
      while(!(f[i+1]==0 && f[i+2]==1)){
            cnt++;
            i++;
            if(i==n-1){
              flag=1;
              break;
            }
          }
		  System.out.println(cnt+1);

      if(flag==1){
        return f[(int)n];
      }
      else{

      int periodLength= cnt+1;
      
      int newF=(int)(n%periodLength);
      return f[newF];
    }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m= scanner.nextLong();
        int ans = getPisanoPeriod(n,m);
        System.out.println(ans);
    }
}
