import java.io.*;
import java.util.*;


public class PlacingParantheses{
  public static long[] MinMax(int i, int j, long M[][], long m[][], char op[]){
    long a=0,b=0,c=0,d=0;
    long arr[] = new long[2];
    long min = Integer.MAX_VALUE;
    long max = Integer.MIN_VALUE;
    for(int k=i;k<=j-1;k++){
      if(op[k]=='+'){
        a=M[i][k] + M[k+1][j];
        b=M[i][k] + m[k+1][j];
        c=m[i][k] + M[k+1][j];
        d= m[i][k] + m[k+1][j];
      }

      else if(op[k]=='-'){
        a=M[i][k] - M[k+1][j];
        b=M[i][k] - m[k+1][j];
        c=m[i][k] - M[k+1][j];
        d= m[i][k] - m[k+1][j];
      }

      else if(op[k]=='*'){
        a=M[i][k] * M[k+1][j];
        b=M[i][k] * m[k+1][j];
        c=m[i][k] * M[k+1][j];
        d= m[i][k] * m[k+1][j];
      }
      min= Math.min(min,Math.min(a,Math.min(b,Math.min(c,d))));
      max= Math.max(max,Math.max(a,Math.max(b,Math.max(c,d))));

    }

    arr[0]=min;
    arr[1]=max;
    return arr;

  }



  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String expression= sc.nextLine();
    int len= expression.length();
    int n = (int)Math.ceil((double)len/2);
    long digits[] = new long[n];
    int u=0;
    int counter=0;
    while(u<=len-1){
      digits[counter] = Character.getNumericValue(expression.charAt(u));
      counter++;
      u=u+2;
    }



    int q=1;
    char op[]= new char[len-n];
    int cnt=0;
    while(q<=len-1){
      op[cnt] = expression.charAt(q);
      cnt++;
      q=q+2;
    }

    long M[][]= new long[n][n];
    long m[][]= new long[n][n];
    for(int i=0;i<n;i++){
      M[i][i]=digits[i];
      m[i][i]= digits[i];
    }
    long temp[] = new long[2];
    for(int s=1;s<n;s++){
      for(int i=0;i<n-s;i++){
        int j = i+s;
        temp=MinMax(i,j,M, m, op);
        m[i][j]= temp[0];
        M[i][j] = temp[1];

      }
    }
    System.out.println(M[0][n-1]);

  }
}
