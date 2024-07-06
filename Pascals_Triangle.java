import java.util.*;
public class Pascals_Triangle{
    //public static void main(String[] args){
    public int factorial(int i) {
        if (i == 0) return 1;
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        //int[][] pascal=new int[n][n];
        //int n = 5; // Change this to the desired number of rows
        Pascals_Triangle pascal = new Pascals_Triangle();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + pascal.factorial(i) / (pascal.factorial(i - j) * pascal.factorial(j)));
            }
            System.out.println();
        }
    }
}
