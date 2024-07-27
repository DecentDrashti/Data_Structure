/**  singly Queue
 1)insert at rare position(Enqueue)
 2)insert at front position
 3)delete at front position(Dequeue)
 5)display the Queue
 Author:Drashti Ruparelia
 Date:25-07-2024
 */
import java.util.*;
class D_Queue {
    int[] queueArray;
    int front;
    int rear;
    int maxSize;
    public D_Queue(int capacity){
       maxSize = capacity;
       queueArray = new int[maxSize];
       front = 0;
       rear = 0;
    }

    public void insertAtFront(int element){
       if(front==1){
        System.out.println("Queue is full. Cannot enqueue. It is overflow");
        return ;
       }
       if(front==0){
        front++;
        rear=1;
      }else{
        front--;
      }
      queueArray[front]=element;
    }


    public void insertAtRear(int element){
        if(rear==maxSize) rear=1;
        else rear++;

        if(front==rear){
          System.out.println("Queue is full. Cannot enqueue. It is overflow");
          return ;
        }
        queueArray[rear]=element;

        if(front==0){
          front=1;
         }
    }

    public int deleteAtFront(){
      int y=0;
        if(front==0){
            System.out.println("Queue is empty. Cannot dequeue.It is underflow");
            return 0;
        }
        y=queueArray[front];

        if(front==rear){
            front=0;
            rear=0;
        return y;
        }

        if(front==maxSize) front=1;
        else front++;
        return y;
    }

     public int deleteAtRear(){
      int y=0;
      if(rear==0){
        System.out.println("it can not be dequeue further as it is underflow");
        return 0;
      }
      y=queueArray[rear];
      if(rear==front){
        rear=0;
        front=0;
      }else{
        rear--;
      }
      return y;
    }

    public void display(){
      if (front ==0 &&rear==0) {
            System.out.println("Queue is empty.");
            return;
        }
        
        for (int i = front; i != rear; i=(i+1)%maxSize) {
            System.out.print("i:"+queueArray[i] + " ");
        }
           System.out.print("i++:"+rear + " ");
        System.out.println();
    }
}

public class Double_Ended {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       
      //Scan the total element of queue
      System.out.println("Enter the total number to be entered in a Queue");
      int n=sc.nextInt();

      D_Queue queue = new D_Queue(n+1);

      int choice;

        do {
            System.out.println("\nPress the following number as per your requirement:\n1 -> insert a number at rear position (enqueue) \n2 -> insert a number at front position \n3 -> Delete the number from front position (dequeue) \n4 -> Delete a number from rear position \n5 -> Display \n6 -> Exit");
            choice = sc.nextInt();
           switch(choice){
                case 1:
                    System.out.println("Enter a value to be insert at rear position: ");
                    int x = sc.nextInt();
                    queue.insertAtRear(x);
                    break;

                case 2:
                  System.out.println("Enter a value to be insert at rear position: ");
                    int z = sc.nextInt();
                    queue.insertAtFront(z);
                    break;
                       
                case 3:
                    queue.deleteAtFront();
                    break;
                  
                case 4:
                    queue.deleteAtRear();
                    break;

                case 5:
                    queue.display();
                       break;

                case 6:
                    System.out.println("Exiting the program.Have a Wonderful Day...bye bye!");
                    
                    return;
                    
                default:
                     System.out.println("Invalid choice. Please select a valid option.");
                

                

        }
       } while (choice != 6);
        sc.close();
    

      //Scan the values of Queue and enqueue each element in Queue
      // System.out.println("Enter the values of Queues one by one");
      // for(int i=1;i<=n;i++){
      //   System.out.print("i:");
      //   int x=sc.nextInt();
      //   queue.insertAtRear(x);
      // }
      
      // //final display of queue after entering the value to it
      // System.out.println("The Queue element are as follows");
      // queue.display();
      
      // queue.dequeue();
      // queue.display(); 
    }
}
