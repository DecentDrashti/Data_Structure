import java.util.*;
public class Selection_Sort{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element of the array which is to be selection sort");
        for(int i=0;i<n;i++){
            System.out.print("arr[i]=");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex]>arr[j]){
                  minIndex=j;
                }                
            }
            if(minIndex!=i){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
        System.out.println("Thus the array after sort is");
        for(int i=0;i<n;i++){
        System.out.println("arr[i]="+arr[i]);
        }
    }
}