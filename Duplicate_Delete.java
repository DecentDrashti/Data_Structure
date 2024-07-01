import java.util.*;
public class Duplicate_Delete{
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
     int[]temp=new int[n];
     int k=0;
      temp[k]=arr[0];
     
        System.out.println("Duplicate numbers if any are");
        for(int i=0;i<n;i++){
            if(temp[k]!=arr[i]){
                k++;
                temp[k]=arr[i];
            }else{
                System.out.println("Duplicate number is:"+arr[i]);
            }
        }
        System.out.println("final array is:");
        for(int i=0;i<n;i++){
            System.out.println("arr["+i+"]="+temp[i]);
        }
  }
}