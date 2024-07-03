import java.util.*;
public class Merge_Unshorted{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    //1st array
     System.out.println("enter the length of 1st array");
     int n1=sc.nextInt();

     int[]arr1=new int[n1];

     System.out.println("enter the value of  1st array:");
     for(int i=0;i<n1;i++){
        System.out.println("arr1["+i+"]=");
        arr1[i]=sc.nextInt();
     }
    
    //2nd array
    System.out.println("enter the length of an array");
     int n2=sc.nextInt();

     int[]arr2=new int[n2];

     System.out.println("enter the value of array:");
     for(int i=0;i<n2;i++){
        System.out.println("arr2["+i+"]=");
        arr2[i]=sc.nextInt();
    }

    //3rd array
    int k=n1+n2;
    int []ans=new int[k];
    int index = 0;
        
        //for merging 1st array in an answer array
        for(int i=0;i<n;i++){
            ans[index] = arr1[i];
            index++;
        }
        
        //for merging 2nd array in an answer array 
        for(int i=0;i<m;i++){
            ans[index] = arr2[i];
            index++;
        }
        
        //for merged array
        System.out.println("Merged array is: "); 
        for(int i=0;i<k ;i++){
            System.out.println("ans["+i+"] : "+ans[i]);
        }
    }
}
    