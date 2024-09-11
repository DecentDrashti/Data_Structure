import java.util.*;
public class Shell_Sort{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of digits in the array");
        int n=sc.nextInt();
        int[]a=new int[n];
        //int[]ans=new int[n];
    
        for(int i=0;i<n;i++){
            System.out.println("arr["+i+"]: ");
            a[i]=sc.nextInt();
        }
    
    int temp=0;
    int gap=n/2;
    for( gap=n/2;gap>=1;gap=gap/2){
        for(int j=gap;j<n;j++){
            for(int i=j-gap;i>=0;i=i-gap){
                if(a[i+gap]>a[i]) break;
                else {
                   temp=a[i+gap];
                   a[i+gap]=a[i];
                   a[i]=temp;
                    //swap(a[i+gap],a[i]);
            }
        }
    }
 }
 System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.println("ans[" + i + "] = " + a[i]);
        }
}
}
