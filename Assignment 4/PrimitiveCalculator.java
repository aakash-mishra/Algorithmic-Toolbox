import java.io.*;
import java.util.*;

public class PrimitiveCalculator{

  public static void main(String args[]) throws Exception{
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    int mem[]= new int[x+1];
    mem[0]=0; // to make 1-based indexing
    mem[1]= 0;// n(1)=0 obviously

    //start memoization
    for(int i=2;i<=x;i++){
      int minCount = Integer.MAX_VALUE;

      if(i%3==0 && mem[i/3]<minCount) {
        minCount = mem[i/3]+1;
      }

      if(i%2==0 && mem[i/2]<minCount){

        minCount = mem[i/2]+1;
      }

      if(mem[i-1] < minCount){
        minCount = mem[i-1]+1;
      }

      mem[i] = minCount;

      }
      ArrayList<Integer> list = new ArrayList<Integer>();



      System.out.println(mem[x]);
      int og = x;
      int len = mem[x];
      for(int i=1;i<=len;i++){
        int minCount = Integer.MAX_VALUE;
        int index=0;
          if(x%3==0){
            if(mem[x/3] < minCount){
            minCount = mem[x/3];
            index= x/3;
          }

          }

          if(x%2==0){
            if(mem[x/2] < minCount){
            minCount = mem[x/2];
            index=x/2;
          }
          }

          if(mem[x-1] < minCount){
          minCount = mem[x-1];
          index= x-1;
        }
          x= index;
          list.add(index);

        }
        Collections.reverse(list);
        ListIterator<Integer> i = list.listIterator();
        while(i.hasNext()){
          System.out.print(i.next()+" ");
        }
        System.out.print(og);


    }
  }
