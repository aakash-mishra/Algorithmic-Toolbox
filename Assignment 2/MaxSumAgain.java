import java.io.*;
import java.util.*;

public class MaxSumAgain{


  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int a[]= new int[n];
    ArrayList<String> s= new ArrayList<String>();
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      s.add(a[i]);
    }
    System.out.print(s[2]);

    // for(int i=0;i<str.length()-1;i++)
    // if(s[i].charAt(0) > s[i+1].charAt(0))
    // max=s[i];
    //
    // ans=ans+max;



  }
}
