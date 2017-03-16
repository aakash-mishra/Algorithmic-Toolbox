import java.io.*;
import java.util.*;

public class ChangingMoney{

  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();

    int i=0;
    int arr[]= new int[3];
    arr[0]=10;
    arr[1]=5;
    arr[2]=1;
    int cnt=0;
    while(n!=0){

      if( n-arr[i] >= 0){
      n=n-arr[i];
      cnt++;
    }
      else
      i++;
    }
    System.out.print(cnt);

}
}
