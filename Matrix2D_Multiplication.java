import java.util.*;
public class Matrix2D_Multiplication{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int [][] arr1=new int[3][2];
        int [][] arr2=new int[2][3];
        int [][] arr3=new int[3][3];
        System.out.println("enter the value of 1st 3*2 array");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
             arr1[i][j]=sc.nextInt(); 
            }
        }
        System.out.println("enter the value of 2nd 2*3 array");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
             arr2[i][j]=sc.nextInt();  
            }
        }
        System.out.println("Answer:");
        for(int i=0;i<3;i++){
             System.out.print("|");
            for(int j=0;j<3;j++){
                arr3[i][j]=0;
                for(int k=0;k<2;k++){
                arr3[i][j]+=(((arr1[i][k])*(arr2[k][j])));
                // System.out.print(arr3[i][j]);
                }
            }
            System.out.println("|");
        }
        System.out.println("Answer:");
         for(int i=0;i<3;i++){
            System.out.print("|");
             for(int j=0;j<3;j++){
                System.out.print(arr3[i][j]);
            }
            System.out.println("|");
        }
    }
}