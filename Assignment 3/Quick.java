import java.util.*;
import java.io.*;

public class Quick{

  static void swap(int a[], int x, int y){
    int temp = a[x];
    a[x] = a[y];
    a[y] = temp;

  }

  static int partition(int a[], int l, int r){
    int x = a[l];
    int j = l;
    for(int i=l+1;i<=r;i++){
      if(a[i] <= x){
        j = j+1;
        swap(a,j,i);
      }
    }

    swap(a,j,l);
    return j;

  }

  static int[] partition3(int a[], int l, int r){

    int x = a[l];
    int j = l;
    for(int i=l+1;i<=r;i++){
      if(a[i] <= x){
        j = j+1;
        swap(a,j,i);
      }
    }
    swap(a,j,l);
    int m1 = l;
    int m2 = j;
    int i = l;
    while(i<=j-1){

      if(a[i] < x){
        if(m1 + 1 != j){
          swap(a,i,m1);
        }
        m1 = m1+1;

      }
      i++;

    }


    int arr[] = {m1, m2};
    return arr;

  }

  static void quick(int a[], int l, int r){
    if(l>=r)
    return;
    Random rand = new Random();
    int random = rand.nextInt( (r-l) + 1 ) + l;
    swap(a,l,random);

    // ***normal quick sort***
    // ***comment this out if you want to run the 3-way version***

    // int m = partition(a,l,r);
    // quick(a,l,m-1);
    // quick(a,m+1,r);

    // ***3-way quick sort***
    // ***comment this out if you want to run the normal version***


    int m[] = partition3(a,l,r);
    quick(a,l,m[0]-1);
    quick(a,m[1]+1,r);

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
    a[i] = sc.nextInt();


    quick(a, 0, a.length - 1);

    for(int x: a)
    System.out.print(x + " ");
  }
}
