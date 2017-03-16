import java.io.*;
import java.util.*;

public class AdRevenue{

  public static void Merge(int a[],int l[], int lCount, int r[],int rCount){

    int i=0,k=0,j=0;
    while(i<lCount && j<rCount){
      if(l[i]>=r[j]){
        a[k]=l[i];
        i++;
      }
      else {
        a[k]=r[j];
        j++;
      }
      k++;

    }

    while(lCount > i){
      a[k]=l[i];
      i++;
      k++;
    }

    while(rCount > j){
      a[k]=r[j];
      k++;
      j++;
    }


  }

  public static void MergeSort(int a[],int n){
    if(n<2){
      return;
    }
    else{
      int mid=n/2;

      int l[]= new int[mid];
      int r[]= new int[n-mid];
      for(int i=0;i<mid;i++)
      l[i]=a[i];
      for(int i=mid;i<n;i++)
      r[i-mid]=a[i];

      MergeSort(l,mid);
      MergeSort(r,n-mid);
      Merge(a,l,mid,r,n-mid);
    }


  }

  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int a[]= new int[n];
    int b[]= new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      b[i]=sc.nextInt();
    }
    long sum=0;
    if(n==1){
       sum= ((long)a[0]*(long)b[0]);
    }
    else{
      MergeSort(a,n);
      MergeSort(b,n);
      for(int i=0;i<n;i++){
        sum = sum +(long)a[i]*(long)b[i];
      }
    }
      System.out.println(sum);


}
}
