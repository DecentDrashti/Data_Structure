import java.util.*;
//import java.util.Stack;

public class Evaluate_postfix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String postfix = sc.nextLine();
        posteval(postfix);
        sc.close();
    }

    public static void posteval(String postfix){
        Stack<Integer> s = new Stack<>(); 

        for(int i=0;i<postfix.length();i++){
            char temp = postfix.charAt(i);
            if(Character.isDigit(temp))
            {
                s.push(Integer.parseInt(String.valueOf(temp)));
            }
            else
            {
                int op2 = s.pop();
                int op1 = s.pop();
                switch (temp) {
                    case '+': s.push(op1 + op2);
                        break;
                    case '-': s.push(op1 - op2);
                        break;
                    case '*': s.push(op1 * op2);
                        break;
                    case '/': s.push(op1 / op2);
                        break;
                    case '^': s.push(op1 ^ op2);
                        break;
                
                    default:
                        break;
                }
            }
        }
        System.out.println(s.pop());
    }
}