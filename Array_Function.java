//find sum max min avg etc
import java.util.*;
public class Array_Function{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of digits in the array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the value of array");
            arr[i]=sc.nextInt();
        }
        int sum=arr[0];
        int min=arr[0];
        int max=arr[n-1];
        for(int i=1;i<n;i++){
            sum+=arr[i];
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        } 
        int avg=sum/n;
        System.out.println("minimum:-"+min+"\nsum:-"+sum+"\naverage:-"+avg+"\nmaximum:-"+max);
    }
}