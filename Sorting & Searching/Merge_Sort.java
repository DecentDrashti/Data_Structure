import java.util.*;
public class Merge_Sort{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of digits in the array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the value of array");
            arr[i]=sc.nextInt();
        }
        int low =0;
        int high=n-1;
        mergesort(arr,low,high);
        for (int i = low; i <=high; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    // public static void display(int arr[]){
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }

    public static void mergesort(int arr[],int low,int high){
        if(low<high){
            int mid=(int)Math.floor((low+high)/2);
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int arr[],int low,int mid,int high){
       int temp[] = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int k =0;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= high){
            temp[k++] = arr[j++];
        }

        for(k =0,i =low; k< temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

}
