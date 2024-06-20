import java.util.*;
public class Delete_Location{
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of digits of array");
     int n=sc.nextInt();
     int[]arr=new int[n];
     int[]temp=new int[n-1];
     System.out.println("enter the value of array:");
     for(int i=0;i<n;i++){
     System.out.print("arr["+i+"]=");
     arr[i]=sc.nextInt();
     }
     System.out.println("enter the number to delete");
     int num=sc.nextInt();
     System.out.println("enter the index where the number is to be deleted");
     int index=sc.nextInt();
    //  int k=0;
     for(int i=0;i<(n);i++){
        if(i==index){
            //temp[i]=num;
            int k=i;
            for(int j=k+1;j<n;j++){
                temp[k]=arr[j];
                k++;
            }
            }else if(i<index){
                temp[i]=arr[i];
            }
        }
        System.out.println("final array is:");
        for(int i=0;i<(n-1);i++){
            System.out.println("arr["+i+"]="+temp[i]);
        }
     }
    }