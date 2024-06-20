import java.util.*;
public class Armstrong{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of digits in the array");
        int n=sc.nextInt();
        // int[]arr=new int[n];
        while(a!=0){
        // r=a%10
         n=n/10; 
         n++;
        }
        int num=0;
        int temp=n;
        int r;
    //d=n
    while(temp!=0){
        r=temp%10 
        //d=d*10+r
        num+=Math.pow(r,n)
        temp=Math.floor(temp/10)
     }
      if(num==n){
            System.out.println("Armstrong number");
    }
  }
}