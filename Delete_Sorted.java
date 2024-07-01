import java.util.*;
public class Delete_Sorted{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
     System.out.println("enter the length of an array");
     int n=sc.nextInt();
     int[]arr=new int[n];
     System.out.println("enter the value of array:");
     for(int i=0;i<n;i++){
        System.out.println("arr["+i+"]=");
        arr[i]=sc.nextInt();
        
     }
        System.out.println("enter the number to delete");
        int num=sc.nextInt();
        int[]temp=new int[n-1];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                continue;
            }else{
                temp[k]=arr[i];
                k++;
            }
        }
        System.out.println("final array is:");
        for(int i=0;i<(n-1);i++){
            System.out.println("arr["+i+"]="+temp[i]);
        }
    }
}