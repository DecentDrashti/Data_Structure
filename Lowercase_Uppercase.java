import java.util.*;
public class Lowercase_Uppercase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        String changed = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                changed += (char)(s.charAt(i)-32);
            }else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                changed += (char)(s.charAt(i)+32);
            }else{
                changed += s.charAt(i);
            }
        }
        System.out.println(changed);
    }
}