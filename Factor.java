import java.util.*;
public class Factor{
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
      int i=1;
      int [] fact=new int[n];
      while(i<=n){
        if(n%i==0){
            fact[i]=n;
            i++;
        }else{
            continue;
        }
      }
      System.out.println(fact);
    }
}