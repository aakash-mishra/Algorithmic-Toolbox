import java.io.*;
import java.util.*;


public class MajorityRec{

  public static int getMajorityElement(int a[], int l, int r){

    if(l==r)
    return a[l];

    else{
      int mid=(l+r)/2;
      int thresh= (int)Math.ceil((double)(r-l)/2);
      int left= getMajorityElement(a,l,mid);
      int right= getMajorityElement(a,mid+1,r);

      if(left==right)
      return left;

      int lcount= getCount(a,left,l,r);
      int rcount= getCount(a,right,l,r);

      if(lcount>thresh){
        //System.out.println("returning "+lno);
      return left;
    }
      else if(rcount>thresh){
         //System.out.println("returning "+rno);
      return right;
    }

      return -1;
    }

  }

  public static int getCount(int a[], int num, int low, int high){

    int cnt=0;
    for(int i=low;i<=high;i++){
      if(a[i]==num)
      cnt++;
    }
    return cnt;
  }

  public static void main(String args[]){



    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int a[]= new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();

    int ans=getMajorityElement(a,0,n-1);
    if(ans==-1)
    System.out.println("0");
    else
    System.out.println("1");
  }
}
