import java.util.*;
public class Prime{
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     int n=sc.nextInt();
     int count=0;
     for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                // System.out.println(i);
            }
     }
     if(count>2){
        System.out.prime("number is even");
     }else {
        System.out.print("number is odd");
     }
    }
}