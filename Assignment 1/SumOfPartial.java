import java.util.*;

public class SumOfPartial {
    private static int getLastDigit(long n, long m){

      int start=  (int)(n%300);
      int end=  (int) (m%300);

      if((start==0 && end==1) || (start ==1 && end==1)){
        return 1;
      }
      else if(start==0 && end==0){
        return 0;

      }

      else{

      int f[]=new int[end+1];
      int s[]=new int[end+1];
      if(start==1)
      s[1]=1;
      f[0]=0;
      f[1]=1;
      for(int i=2;i<=end;i++){
        f[i]=(f[i-1]+f[i-2])%10;
        if(i<start){
          s[i]=0;
        }
        else{
        s[i]=(s[i-1]+f[i])%10;
      }
      }
      return s[end];
    }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m= scanner.nextLong();
        int ans= getLastDigit(n,m);
        System.out.println(ans);
    }
}
