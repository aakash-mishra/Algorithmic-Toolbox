import java.io.*;
import java.util.*;

public class Knapsack{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int n = sc.nextInt();
    int weight[] = new int[n+1];
    weight[0]=0;
    for(int i=1;i<=n;i++){
      weight[i]=sc.nextInt();
    }
    int value[][] = new int[W+1][n+1];


    for(int i=1;i<=n;i++){

      for(int w=1;w<=W;w++){
        value[w][i]= value[w][i-1]; // item i was not choosen
        if(weight[i]<=w){
          if((value[w-weight[i]][i-1]+weight[i]) > value[w][i])
          value[w][i]=(value[w-weight[i]][i-1]+weight[i]);
        }
      }
    }

    System.out.println(value[W][n]);




  }
}
