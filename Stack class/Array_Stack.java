import java.util.Scanner;
public class Array_Stack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack:");
        int n = sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the value of array:");
        for(int i=0;i<n;i++){
        System.out.print("arr["+i+"]=");
        arr[i]=sc.nextInt();
         }
        Stack s = new Stack(n);
        System.out.println("To facilitate the array with stack function press following number as per your requirement \n 1->Push\n 2->Delete\n 3->Peep\n 4->Change\n 5->Display\n 6->exit");

        boolean isTheEnd = false;
        while (true) {
            System.out.println("Please enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be pushed:");
                    int x = sc.nextInt();
                    s.push(x);
                    break;

                case 2:
                    int popped = s.pop();
                    if (popped == -1) {
                        System.out.println("Stack underflow");
                    } else {
                        System.out.println("Popped element is: " + popped);
                    }
                    break;

                case 3:
                    System.out.println("Enter the index to peep/see the element:");
                    int i = sc.nextInt();
                    int peep = s.peep(i);
                    if (peep == -1) {
                        System.out.println("Invalid Index");
                    } else {
                        System.out.println("Element at index " + i + " is: " + peep);
                    }
                    break;

                case 4:
                    System.out.println("Enter the index and the new element to change:");
                    System.out.println("i=");
                    i = sc.nextInt();
                    System.out.println("x=");
                    x = sc.nextInt();
                    s.change(i, x);
                    break;

                case 5:
                    s.display();
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
class Stack {
    int top = -1;
    int n;
    int[] arr;
    
    Stack(int n) {
        this.n = n;
        arr = new int[n];
    }

    void push(int x) {
        if (top >= (n-1)) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            arr[top] = x;
            System.out.println("Element is pushed successfully");
        }
        return;
    }

    int pop() {
        if (top == -1) {
            return -1;
        } else {
            top = top - 1;
            return arr[top+1];
        }
    }

    int peep(int i) {
        if ((top - i + 1) <=0 || i<=0) {
            return -1;
        } else {
            return arr[top - i + 1];
        }
    }

    void change(int i, int x) {
        if ((top - i + 1) <=0 || i<=0) {
            System.out.println("Invalid Index");
            return;
        } else {
            arr[top - i + 1] = x;
            System.out.println("Your changes are done successfully");
            return;
        }
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
        return;
    }
}
