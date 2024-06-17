import java.util.*;
public class Factorial_Recursion{
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     int n=sc.nextInt();
     int ans=product(n);
     System.out.println(ans);
    }
    public static int product(int n){
        if(n==1){
            return 1;
        }
        return n*product(n-1);
        // while(n>0){
        //     int ans=n*product(n-1);
        //     //n--;
        // }
    }

}