import java.util.*;
class Node {
    int data;
    Node link;

     public Node(int data) {
        this.data = data;
        this.link = null;
    }
}
class Stacks{
     Node top =null;

      public void push(int data) {
        Node newNode = new Node(data);

        if(top==null)
        {
         top=newNode;
        }
        else
        { 
        top.link = newNode;
          newNode=top;
        }
    }
    public void display() {
      Node current = top;
      if(current==null){
        System.out.println("Sorry linkedlist is null");
        return;
      }
        while (current != null) 
        {
        System.out.print(current.data + " ");
        current = current.link;
        }
    }

    public void poll(){
        Node current = top;
        if(top==null)
        {
          System.out.println("oops!!no element inside can not be pop");
        }
        else
        {
          top=top.link;
          current.link=null;
          System.out.println("Thus,the top most element is popped");
        }
    }
    public void peek(int i){
        Node current=top;
        if(top==null)
        {
          System.out.println("Stack is empty");
          return ;
        }
        for(int j=0;j<=i;j++)
        {
          if(j==i){
            System.out.println(current.data);
          }
          else{
            current=current.link;
          }
        }
        //doubt
        // if(j>i){
        //     System.out.println("you have entered only"+i+"values of linkedlist so only values till"+(i-1)+"is possible");
        // }
        //and peek ni loop one thi chalu karvi che
    }  
} 

public class Implement_Queue {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        Stacks st=new Stacks();
        
      
        int choice;

        do {
            System.out.println("\nPress the following number as per your requirement:");
            System.out.println("1 -> Push the number on the top");
            System.out.println("2 -> Delete the number from the top");
            System.out.println("3 -> Peek the top element");
            System.out.println("4 -> Display the whole linked list");
            System.out.println("5 -> Exit");
            choice = sc.nextInt();
           switch(choice){
                case 1:
                    System.out.println("Enter a value to Push: ");
                    int x = sc.nextInt();
                    st.push(x);
                    break;

                case 2:st.poll();
                       break;
                       
                case 3:
                    System.out.println("Enter a position of element to peek: ");
                    int i = sc.nextInt();
                    st.peek(i);
                    break;

                case 4:st.display();
                       break;

                
                default:
                     System.out.println("Invalid choice. Please select a valid option.");
                

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    
                    return;

        }
       } while (choice != 5);
        sc.close();
    }
}
