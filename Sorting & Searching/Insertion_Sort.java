import java.util.*;
public class Insertion_Sort{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Array : ");
        int n = sc.nextInt();
        
        int[] arr =  new int[n];

        System.out.println("Enter elemets into array : ");
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"] : ");
            arr[i]= sc.nextInt();        
        }

        insertionSort(arr);
    }

    public static void insertionSort(int arr[]){

        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>key;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1]=key;
        }

        System.out.println();
        System.out.println("---Sorted_Array---");
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k] + " ");
        }
    }
}