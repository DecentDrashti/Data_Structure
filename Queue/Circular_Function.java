import java.util.*;
class Queue_C {
    int[] queueArray;
    int front;
    int rear;
    int maxSize;
    public Queue_C(int capacity){
       maxSize = capacity;
       queueArray = new int[maxSize];
       front = 0;
       rear = 0;
    }
    public void insert(int element){
       if(rear==maxSize) rear=1;
        else rear++;

        if(front==rear){
          System.out.println("Queue is full. Cannot enqueue. It is overflow");
          return;
        }
        queueArray[rear]=element;

        if(front==0){
          front=1;
         }
    } 

    public int delete(){
        int y=0;
        if(front==0){
            System.out.println("Queue is empty. Cannot dequeue.It is underflow");
            return -1;
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
public class Circular_Function{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        Queue_C queue=new Queue_C(n+1);
        
        int choice;

        do {
            System.out.println("\nPress the following number as per your requirement:\n1 -> insert a number at rear position (enqueue) \n2 -> Delete the number from front position (dequeue) \n3 -> Display \n4 -> Exit");
            choice = sc.nextInt();
           switch(choice){
                case 1:
                    System.out.println("Enter a value to be insert at rear position: ");
                    int x = sc.nextInt();
                    queue.insert(x);
                    break;

                case 2:
                    queue.delete(z);
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
//       System.out.println("Enter the values of Queues one by one");
//       for(int i=1;i<=n;i++){
//         System.out.print("i:");
//         int x=sc.nextInt();
//         queue.insert(x);
//       }

//       //final display of queue after entering the value to it
//       System.out.println("The Queue element are as follows");
//       queue.display();
      
//       queue.delete();
//       queue.display(); 
    
//     }
// }