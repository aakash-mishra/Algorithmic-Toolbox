  import java.io.*;
  import java.util.*;

  public class MaximumLoot{

    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      int W= sc.nextInt();
      int v[]=new int[n];
      int w[]= new int[n];
      double valueByWt[]= new double[n];
      for(int i=0;i<n;i++){
        v[i]=sc.nextInt();
        w[i]=sc.nextInt();
        valueByWt[i]=((double)v[i]/w[i]);
      }

      //sort in descending order of value/weight
      for(int i=0;i<n-1;i++){

        for(int j=i+1;j<n;j++){
          if(valueByWt[i]<valueByWt[j]){
            int temp=v[i];
            v[i]=v[j];
            v[j]=temp;

            int temp2=w[i];
            w[i]=w[j];
            w[j]=temp2;

            double temp3=valueByWt[i];
            valueByWt[i]=valueByWt[j];
            valueByWt[j]=temp3;
          }
        }
      }



      int i=0;
      double value=0;
      while(W>0 && i<n){

        int min= Math.min(w[i],W);

        value=( (double)value +  (double)(min * valueByWt[i]));
        W=W-min;
        i++;

      }


  System.out.println(String.format("%.4f",value));
  // System.out.println(value);
  }
  }
