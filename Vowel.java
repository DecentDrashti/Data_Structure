import java.util.*;
public class Vowel{
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the character");
     char c=sc.next().charAt(0);
     if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
        System.out.println("the character is vowel");
     }else{
        System.out.println("the character is consonant");
     }
    }
}