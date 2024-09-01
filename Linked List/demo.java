import java.util.*;

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class Dupli {
    public Node head = null;
    //public Node tail = null;
    public void removeDuplicates(LinkedList<Integer> list) {
        // current node points to the head element
        Node current = head, index = null, temp = null;
 
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // temp node points to the previous node
                temp = current;
                // index node points to node next to current
                index = current.next;
 
                while (index != null) {
                    // checking if node of current data is
                    // equal to index node data
                    if (current.data == index.data) {
 
                        // duplicate node is skipped
                        temp.next = index.next;
                    }
                    else {
                        // temp node points to the previous
                        // node of index node
                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
 

    // Other methods (if needed) can be added here
}

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dupli st = new Dupli();

        LinkedList<Integer> list = new LinkedList<Integer>();

        System.out.println("Enter the size of the list:");
        int n = sc.nextInt();

        System.out.println("Enter the values for the list:");
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the value at position " + i + ":");
            int a = sc.nextInt();
            list.add(a);
        }

        st.removeDuplicates(list);

        // Print the modified list (without duplicates)
        System.out.println("Modified list after removing duplicates:");
        System.out.println(list);
    }
}


// class Node {
//     int data;
//     Node link;

//      public Node(int data) {
//         this.data = data;
//         this.link = null;
//     }
// }
// class Stacks{
//      Node top =null;

//       public void push(int data){
//         Node newNode = new Node(data);
      
//         System.out.println("jhgkhffjgdh");
        
//         if(top==null)
//         {
       
//             top = newNode;
//         }
//         else 
//         {
//         newNode.link = top;
//           top=newNode;
//         }
//     }
//     public void display() {
//     Node current = top;
//     while (current != null) {
//         System.out.print(current.data + " ");
//         current = current.link;
//     }
// }} // Add this closing brace


// public class demo {
//     //Node newNode = new Node(data);

//     public static void main(String[]args) {
//         System.out.println("scjhcnm");
//         Stacks st=new Stacks();
//         st.push(20);
//         st.push(30);
//         st.display();
//         }
//     }

/*    import java.util.Scanner;

class LLStack_Operation{
    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    Node top = null;

    public void push(int data) {
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
            return;
        }

        Node save = top;
        top = newNode;
        top.link = save;
    }

    public int pop() {

        if (top == null) {
            System.out.println("Stack is empty!!!!!");
        }

        int ans = top.data;
        top = top.link;
        return ans;
    }

    public int peep(int i) {

        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        Node temp = top;
        for (int j = 1; j < i; j++) {
            if (temp == null) {
                System.out.println("Index out of bounds");
                return -1;
            }
            temp = temp.link;
        }
        if (temp != null) {
            return temp.data;
        }
        return -1;
    }

    public void display(){
        Node temp = top;
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }

    public void change(int i, int data){
        if(top==null){
            System.out.println("Stack is empty");
            return ;
        }
        Node temp=top;
        for(int j=1;j<i;j++){
            if(temp==null){
                System.out.println("Index out of bounds");
                return;
            }
            temp=temp.link;
        }
        if(temp!=null){
            temp.data=data;
            return;
        }
    }

}
public class LinkedList_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LLStack_Operation stack = new LLStack_Operation();
        while (true) {
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. PEEP");
            System.out.println("5. CHANGE");
            System.out.println("6. EXIT");
            System.out.println();
            System.out.print("Enter a choice: ");

            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter a value to Push: ");
                    int x = sc.nextInt();
                    stack.push(x);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Enter a position of element to peep: ");
                    int i = sc.nextInt();
                    stack.peep(i);
                    break;

                case 5:
                    System.out.println("Enter a position of element which you want to change: ");
                    int j = sc.nextInt();
                    System.out.println("Enter a new Value of the element: ");
                    int k = sc.nextInt();
                    stack.change(j, k);
                    break;

                case 6:
                    System.out.println("Exited sucessfully.......");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!! try again!!");
            }
        }
    }
}*/
       
   
