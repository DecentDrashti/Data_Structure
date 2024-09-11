// import java.util.*;
// public class Counting_Sort{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number of digits in the array");
//         int n=sc.nextInt();
//         int[]arr=new int[n+1];
//         int[]ans=new int[n+1];
    
//         for(int i=1;i<=n;i++){
//             System.out.println("enter the value of array the value must be between 1 to 9");
//             arr[i]=sc.nextInt();
//             if(arr[i]<1||arr[i]>9){
//                 System.out.println("Error:the value should be between 1 to 9 \n Re-enter the value ");
//                 arr[i]=sc.nextInt();
//             }
//         }
//         int max=arr[1];
//         for(int i=1;i<=n;i++){
//            if(max<arr[i]){
//             max=arr[i];
//            }
//         }
//         int []c=new int[max+1];
//         for(int i=1;i<=max;i++){
//             c[arr[i]]=c[arr[i]]+1;
//         }
//         for(int i=2;i<=n;i++){
//             c[i]=c[i]+c[i-1];
//         }
//         for(int i=n;i>0;i--){
//             ans[c[arr[i]]]=arr[i];
//             c[arr[i]]=c[arr[i]]-1;
//         }
//         for(int i=1;i<=n;i++){
//             System.out.println("ans["+i+"]"+ans[i]);
//         }

//     }
// }
import java.util.*;

public class Counting_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the value of the array (the value must be between 1 to 9):");
            arr[i] = sc.nextInt();
            while (arr[i] < 1 || arr[i] > 9) {
                System.out.println("Error: The value should be between 1 to 9. Re-enter the value:");
                arr[i] = sc.nextInt();
            }
        }

        int max = arr[1];
        for (int i = 2; i <= n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int[] c = new int[max + 1];
        for (int i = 1; i <= n; i++) {
            c[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            c[i] += c[i - 1];
        }

        for (int i = n; i > 0; i--) {
            ans[c[arr[i]]] = arr[i];
            c[arr[i]]--;
        }

        System.out.println("Sorted array:");
        for (int i = 1; i <= n; i++) {
            System.out.println("ans[" + i + "] = " + ans[i]);
        }
    }
}
