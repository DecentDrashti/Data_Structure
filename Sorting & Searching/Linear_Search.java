import java.util.*;
public class Linear_Search{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element of the array which is to be linear seach");
        for(int i=0;i<n;i++){
            System.out.print("arr[i]=");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to searched");
        int a=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                System.out.println("The element is found thus the index of the element is:"+i);
            } 
        }
    }
}