import java.util.*;
public class Duplicate_Number{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of digits in the array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the value of array");
            arr[i]=sc.nextInt();
        }
        int dupli=arr[0];
        System.out.println("Duplicate numbers if any are");
        for(int i=1;i<n;i++){
            if(dupli==arr[i]){
                System.out.println(dupli);
                // dupli=arr[i+1];
            }else{
                dupli=arr[i+1];
            }
        }
    }
}