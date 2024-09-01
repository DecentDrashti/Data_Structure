import java.util.Scanner;
public class Stack_Function {
     int maxSize;
     int[] stackArray;
     int top;
    
    //constructor is used to initialize variable
    public Stack_Function(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return 0; // Return a sentinel value (you can choose a different one)
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return 0; // Return a sentinel value
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
    
    // Change the value at a specific index
    public void changeValueAtIndex(int index, int newValue) {
        if (index >= 0 && index <= top) {
            stackArray[index] = newValue;
            System.out.println("Value at index " + index + " changed to " + newValue);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void display(){
         System.out.print("Elements present in stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the size of stack:");
        int n = sc.nextInt();

        Stack_Function stack = new Stack_Function(n);
    
        for(int i=0;i<n;i++){
        System.out.println("enter the value to be pushed:");
        System.out.print("1st value=");
        a=sc.nextInt();
        stack.push(a);
        }

        System.out.println("To facilitate the array with stack function press following number as per your requirement \n 1->Push\n 2->Delete\n 3->Peep\n 4->Change\n 5->Display\n 6->exit");

        boolean isTheEnd = false;
        while (true) {
            System.out.println("Please enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be pushed:");
                    int x = sc.nextInt();
                    stack.push(x);
                    break;

                case 2:
                    int popped = stack.pop();
                    if (popped == -1) {
                        System.out.println("Stack underflow");
                    } else {
                        System.out.println("Popped element is: " + popped);
                    }
                    break;

                case 3:
                    System.out.println("Enter the index to peek/see the element:");
                    int i = sc.nextInt();
                    int peek = stack.peek(i);
                    if (peek == -1) {
                        System.out.println("Invalid Index");
                    } else {
                        System.out.println("Element at index " + i + " is: " + peek);
                    }
                    break;

                case 4:
                    System.out.println("Enter the index and the new element to change:");
                    System.out.println("index=");
                    i = sc.nextInt();
                    System.out.println("new element=");
                    x = sc.nextInt();
                    stack.changeValueAtIndex(i, x);
                    break;

                case 5:
                    stack.display();
                    break;

                case 6:
                    isTheEnd = true;
                    break;

                default:
                    System.out.println("Please Enter valid choice");
            } 
            if (isTheEnd) {
                break;
            }
        }
        System.out.println("Have a Wonderful Day...bye bye");//sc.close();
    }
}
        //Stack_Function stack = new Stack_Function(5);
        //instead of these you can also scan the number from user and by storing it in a variable and pushing it in
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);

        // Change the value at index 1 to 25
        //stack.changeValueAtIndex(1, 25);
        
        //System.out.println(stack.pop() + " popped from stack");
//         System.out.println("Top element is: " + stack.peek());
       
//     }
// }
