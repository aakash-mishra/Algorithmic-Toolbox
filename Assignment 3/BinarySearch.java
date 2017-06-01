import java.io.*;
import java.util.*;

public class BinarySearch{

  public static int search(int l, int u, int k, int a[]){

    if(u<l)
    return -1;

    int mid=(l+u)/2;

    if(a[mid]==k)
    return mid;

    else if(k>a[mid])
    return search(mid+1,u,k,a);

    else
    return search(0,mid-1,k,a);

  }

  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    int key[]= new int[k];
    for(int i=0;i<k;i++){
      key[i]=sc.nextInt();
    }
    for(int i=0;i<k;i++)
    System.out.print(search(0,n-1,key[i],a)+" ");

  }

}
