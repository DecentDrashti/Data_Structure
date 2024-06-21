import java.util.*;
public class Conversion_Seconds{
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the seconds");
      int sec=sc.nextInt();
      int hr=0,min=0;
      while(sec>59){
        sec=sec-60;
        min++;
        if(min>59){
            min=min-60;
            hr++;
        }
      }
      System.out.println("Hours:Minute:Seconds:-"+hr+":"+min+":"+sec);
    }
}