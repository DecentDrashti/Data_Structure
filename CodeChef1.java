import java.util.*;
public class CodeChef1{
    public static void sleep_again(){
        try{
        Thread.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of digits in the array");
        int n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("enter the value of array such that value should be unique and positive integers");

        for(int i=0;i<n;i++){
            System.out.println("enter the value for \narr["+i+"]=");
            arr[i]=sc.nextInt();
            while(arr[i]<0){
            System.out.println("re-enter the value as no negative is allowed for arr["+i+"]="+arr[i]);
            arr[i]=sc.nextInt();
            }
        }
        
        System.out.println("Please wait until Your array is being checked if it is according to give condition");

        sleep_again();
      
      for(int i=1;i<n;i++){
        for(int j=0;j!=i&&j<n;j++){
           
            if(arr[j]==arr[i]){
                System.out.println("There is a little error in your given value pls do sort");
                do{
                System.out.println("this number is repeated so replace this number");
                System.out.println("arr["+i+"]="+arr[i]);
                arr[i]=sc.nextInt();
                }
                while(arr[i]==arr[j]);
            }
          }
        }

       sleep_again();

        System.out.println("Yayyy! your array has been checked and it is according to condition");

        sleep_again();

        System.out.println("The Array of Big Brother is as follows:-");

         for(int i=0;i<n;i++){
            System.out.println("A["+i+"]="+arr[i]);
        }
    
        int []temp=new int[n];
        for(int i=1;i<n;i++){
            for(int j=(i-1);j<i;j++){
                if(i==(n-1)){
                    temp[i]=arr[j];
                    temp[0]=arr[i];
                }
                temp[i]=arr[j];
                break;
            }
        }

        System.out.println("The Shuffled Array is:-");

        System.out.println("The Array of small Brother is as follows:-");

        sleep_again();
        for(int i=0;i<n;i++){
            System.out.println("B["+i+"]="+temp[i]);
        }
    }
}
