import java.util.*;
public class Temperature{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temperature:");
        double temp=sc.nextDouble();
        int unit;
        do{
        System.out.println("enter the 1 for converting celsius into fahrenhit and 2 for converting fahrenhit to celsius");
         unit=sc.nextInt();
        }
        while(unit>2||unit<1);
        Conversion_Temp ct=new Conversion_Temp();
        if(unit==1)
        {
         ct.celsius_fahrenit(temp);
        }
        else {
           ct. fahrenit_celsius(temp);
        }

    }
}
class Conversion_Temp{
    public static void celsius_fahrenit(double temp){
       double ans=(1.8*temp)+32;
        System.out.println("The temperature in fahrenhit is:"+ans+"F");
    }
    public static void fahrenit_celsius(double temp){
       double ans=(temp-32)/1.8;
        System.out.println("The temperature in fahrenhit is:"+ans+"F");
    }
}