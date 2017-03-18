import java.io.*;
import java.util.*;


  public class Segments{

    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      int a[]= new int[n];
      int b[]= new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        b[i]=sc.nextInt();
      }

      for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
          if(b[j]<b[i]){
            int temp = b[j];
            b[j]=b[i];
            b[i]=temp;

            int temp2 = a[j];
            a[j]=a[i];
            a[i]=temp2;
          }
        }
      }

      int cnt=0;
      int seg=0;
      ArrayList<Integer> list = new ArrayList<Integer>();
      while(cnt!=n){
        int ans= b[cnt];
        list.add(ans);

        while(a[cnt]<=ans){
          cnt++;
          if(cnt==n)
          break;
        }
        seg++;

      }
      System.out.println(seg);
      Iterator it= list.iterator();
      while(it.hasNext()){
        System.out.print(it.next()+" ");
      }
    }
  }
