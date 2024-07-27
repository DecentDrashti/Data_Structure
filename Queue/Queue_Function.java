/**  singly Queue
 1)insert at rare position(Enqueue)
 2)delete at front position(Dequeue)
 3)display the Queue
 Author:Drashti Ruparelia
 Date:25-07-2024
 */
import java.util.*;
//good approach
class ArrayQueue {
     int[] queueArray;
    //if the private will be removed the other class will have authorities to modify and access directly so better to  keep it encapsulated 
     int front;
     int rear;
     int maxSize;

    public ArrayQueue(int capacity) {
        maxSize = capacity;
        queueArray = new int[maxSize];
        front = 0;
        rear = 0;
    }

    //to insert an element at rear
    public void enqueue(int element) {
        if (rear >= maxSize) {
            System.out.println("Queue is full. Cannot enqueue. It is overflow");
            return;
        }
        rear++;
        queueArray[rear] = element;
         if(front==0){
          front++;
         }
    }

    //to delete an element from front 
    public int dequeue() {
      int y=0;
      if(front==0)
      {
        System.out.println("Queue is empty. Cannot dequeue.It is underflow");
          return -1; 
      }

      if (front == rear) 
      {
        System.out.println("Queue is now empty. Cannot dequeue.");
        y=queueArray[front];
        front=0;
        rear=0;
        return -1; 
       } 

        front++;
        return y;
    }

   //to display the queue
    public void display() {
        if (front ==0 &&rear==0) {
            System.out.println("Queue is empty.");
            return;
        }
        
        for (int i = front; i <= rear; i++) {
            System.out.print("i:"+queueArray[i] + " ");
        }
        System.out.println();
    }
}

public class Queue_Function {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       
      //Scan the total element of queue
      System.out.println("Enter the total number to be entered in a Queue");
      int n=sc.nextInt();

      ArrayQueue queue = new ArrayQueue(n+1);

      
      int choice;

        do {
            System.out.println("\nPress the following number as per your requirement:\n1 -> insert a number at rear position (enqueue)\n2 -> Delete the number from front position (dequeue \n3-> Display \n4-> Exit");
            choice = sc.nextInt();
           switch(choice){
                case 1:
                    System.out.println("Enter a value to be insert at rear position: ");
                    int x = sc.nextInt();
                    queue.enqueue(x);
                    break;
                       
                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.display();
                       break;

                case 4:
                    System.out.println("Exiting the program.Have a Wonderful Day...bye bye!");
                    
                    return;
                    
                default:
                     System.out.println("Invalid choice. Please select a valid option.");
                

                

        }
       } while (choice != 4);
        sc.close();
    }
}

      //Scan the values of Queue and enqueue each element in Queue
    //   System.out.println("Enter the values of Queues one by one");
    //   for(int i=1;i<=n;i++){
    //     System.out.print("i:");
    //     int x=sc.nextInt();
    //     queue.enqueue(x);
    //   }
      
    //   //final display of queue after entering the value to it
    //   System.out.println("The Queue element are as follows");
    //   queue.display();
      
    //   queue.dequeue();
    //   queue.display();

//approx my approach

/*public class Main {
    public static void main(String[] args) {
        int maxSize = 5;
        int[] queueArray = new int[maxSize];
        int front = -1;
        int rear = -1;

        // Enqueue elements
        enqueue(queueArray, maxSize, 10);
        enqueue(queueArray, maxSize, 20);
        enqueue(queueArray, maxSize, 30);

        // Display queue
        displayQueue(queueArray, front, rear);

        // Dequeue an element
        int dequeuedElement = dequeue(queueArray, front, rear);
        System.out.println("Dequeued element: " + dequeuedElement);

        // Display queue after dequeue
        displayQueue(queueArray, front, rear);
    }

    // Enqueue operation
    private static void enqueue(int[] queue, int maxSize, int element) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else {
            rear++;
            queue[rear] = element;
        }
    }

    // Dequeue operation
    private static int dequeue(int[] queue, int front, int rear) {
        if (front == rear) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return a sentinel value or throw an exception
        }
        front++;
        return queue[front];
    }

    // Display operation
    private static void displayQueue(int[] queue, int front, int rear) {
        if (front == rear) {
            System.out.println("Queue is empty.");
        } else {
            for (int i = front + 1; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

//my first approach

public class ArrayQueue{
   
   //method to ENQUEUE
    public void insert(int n,int y){ 
        int f=0;
        int r=0;
        int []Q=new int[n];
          if(r>=n)
          {
            System.out.println("Queue Overflow");
          }
          else
          {
            r++;
            Q[r]=y;
                if(f==0){
                f=1;
                }
          }
        Queue_Function.display();
    }
     

    //method to DISPLAY
    public  void display(){
      
        for(int i=1;i<=n;i++){
          System.out.println("i:"+Q[i]);
        }
    }

    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);

      //Scan the total element of queue
      System.out.println("Enter the total number to be entered in a Queue");
      int n=sc.nextInt();
      
      //Scan the values of Queue and enqueue each element in Queue
      System.out.println("Enter the values of Queues one by one");
      for(int i=1;i<=n;i++){
        System.out.println("i:");
        int y=sc.nextInt();

        Queue_Function.insert(n,y);
      }
      
      //final display of queue after entering the value to it
      System.out.println("The Queue element are as follows");
      //Queue_Function.display(n);

    }
}*/
