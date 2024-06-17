import java.util.*;
public class Addition{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the number m");
        int m=sc.nextInt();
        System.out.println("enter the number n");
        int n=sc.nextInt();
        for(int i=m;i<=n;i++){
          sum+=i;
        }
        System.out.println(sum);
    }
}