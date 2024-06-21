import java.util.*;
public class Matrix2D_Addition{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int [][] arr1=new int[2][2];
        int [][] arr2=new int[2][2];
        int [][] arr3=new int[2][2];
        System.out.println("enter the value of 1st 2*2 array");
        
        for(int i=0;i<2;i++){
           // System.out.print("| ");
            for(int j=0;j<2;j++){
             arr1[i][j]=sc.nextInt(); 
             //System.out.println(arr1[i][j]); 
            }
             //System.out.println(" |");
        }
        System.out.println("enter the value of 2nd 2*2 array");
        for(int i=0;i<2;i++){
            //System.out.print("| ");
            for(int j=0;j<2;j++){
             arr2[i][j]=sc.nextInt();  
            }
            //System.out.println(" |");
        }
        for(int i=0;i<2;i++){
            System.out.print("| ");
            for(int j=0;j<2;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println("|");
        }
        //System.out
   }
}