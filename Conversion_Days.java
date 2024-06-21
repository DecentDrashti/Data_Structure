import java.util.*;
public class Conversion_Days{
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the total number of days");
      int days=sc.nextInt();
      int yr=0,months=0,week=0;
      while(days>6){
        if(days>364){
            days-=365;
            yr++;
        }else if(days>29){
            days=days-30;
            months++;
        }
         else if(days>6){
         days=days-7;
         week++;
        }
      }
      System.out.println("Years:Months:Week:Days "+yr+":"+months+":"+week+":"+days);
    }
}