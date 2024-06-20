import java.util.*;
public class Minimum_Maximum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of digits in the array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the value of array");
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[n-1];
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        } 
        System.out.println("minimum:"+min+"\nmaximum:"+max);
    }
}