import java.util.Scanner;

class Stack {
    int top = -1;
    int n;
    char[] arr;

    Stack(int n) {
        this.n = n;
        arr = new char[n];
    }

    void push(char x) {
        if (top >= (n - 1)) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            arr[top] = x;
            System.out.println("Element is pushed successfully");
        }
    }

    char pop() {
        if (top == -1) {
            return 'c'; // Return a sentinel value (e.g., 'c') for an empty stack
        } else {
            top = top - 1;
            return arr[top + 1];
        }
    }

    char peek() {
        if (top == -1) {
            System.out.println("No value entered");
            return 'c'; // Return a sentinel value (e.g., 'c') for an empty stack
        }
        return arr[top];
    }
}

public class Recognize_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of stack:");
        int n = sc.nextInt();
        Stack st = new Stack(n);
        System.out.println("Enter the string:");
        String input = sc.next();
        String str2;

        
        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                System.out.println("Invalid string");
                return;
            }
            st.push(ch);
        }
        //st.push('c'); 
        int i = 0;
        while (st.peek() != 'c' && i < input.length()) {
            if (st.peek() == input.charAt(input.length() - 1 - i)) {
                st.pop();
            } else {
                System.out.println("Invalid string");
                return;
            }
            i++;
        }
        int count=0;
        for(i=n-3;i>=0;i--){
            char a=input.charAt(i);
            char b=st.peek();
            if(a==(b)){
                count++;
            }
        }

        if (count==(n-3)) {
            System.out.println("Valid string");
        } else {
            System.out.println("Invalid string");
        }
    }
}


// import java.util.*;
// class Stack {
//     int top = -1;
//     int n;
//     int[] arr;
    
//     Stack(int n) {
//         this.n = n;
//         arr = new int[n];
//     }

//     void push(int x) {
//         if (top >= (n-1)) {
//             System.out.println("Stack Overflow");
//         } else {
//             top = top + 1;
//             arr[top] = x;
//             System.out.println("Element is pushed successfully");
//         }
//         return;
//     }

//     int pop() {
//         if (top == -1) {
//             return -1;
//         } else {
//             top = top - 1;
//             return arr[top+1];
//         }
//     }

//     int peek() {
//         if(top==-1){
//             System.out.println("no value entered");
//             return 0;
//         }
//        return arr[top];
//     }
// }
// public class Recognize_String{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the size of stack:");
//         int n = sc.nextInt();
//         Stack st=new Stack(n);
//         System.out.println("Enter the string:");
//         String input = sc.next(); // Read the input string

//         st.push('c'); // Mark the end of the input string
//         for (char c : input.toCharArray()) {
//             if (c == ' ') {
//                 System.out.println("Invalid string");
//                 return;
//             }
//             st.push(c);
//         }

//         int i = 0;
//         int count =0;
        
//         while (st.peek() != 'c') {
//             if (st.peek() == input.charAt(i)) {
//                 st.pop();
//             } else {
//                 st.push(st.peek());
//             }
//             i++;
//         }
//         while(st.peek()=='c'){
//           count++;
//           //System.out.println(count);
//           st.pop();
//           //return;
//         }
//         //System.out.println("hello:"+count);

//         if (st.peek().equals('')|| count>1){
//             System.out.println("Invalid string");
//         }else{
//             System.out.println("Valid string");
//         }
//     }
// }


//         System.out.println("enter the string");
//         String str=sc.next();
//         char [] s = new char [n];
//         // System.out.println("enter the elements of stack:");
//         // for(int i=0;i<n;i++){
//         //     stack[i] = sc.nextInt();
//         // }
//         int i=0;
        
//         st.push('c');
//         while (s[i]!='c'){
//             if(s[i]==' '){
//                System.out.println("invalid string");
//                return ;
//             }
//             // System.out.println("enter the alphabets to be pushed");
//             // stack[i] = sc.next();
//             st.push(s[i]);
//             i++;
//         }
//         //i++;
//         while(st.arr[st.peek()]!='c'){
//             if(st.arr[st.peek()]==str.charAt(i)){
//                 st.pop();
//             }else{
//                 st.push(st.peek());
//             }

//         }
//         if(st.arr[st.peek()]==0){
//             System.out.println("invalid string");
//         }
//     }
// }
