import java.util.*;
public class Read_Display{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of digits in the array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the value of array");
            arr[i]=sc.nextInt();
            //System.out.println("arr["+i+"]="+arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}