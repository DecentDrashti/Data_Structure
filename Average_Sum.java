import java.util.*;
public class Average_Sum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the last number of average");
        int n=sc.nextInt();
        int sum=0,avg=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
       avg=sum/n;
       System.out.println(avg);
    }
}