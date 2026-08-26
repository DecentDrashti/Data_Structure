import java.util.*;

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class Queue {
    Node front = null;
    Node rear = null;

    // Add element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (front == null) {
            front = newNode;
            rear = newNode;
        } 
        else {
            rear.link = newNode;
            rear = newNode;
        }

        System.out.println(data + " is added to the queue");
    }

    // Remove element from the queue
    public void dequeue() {
        if (front == null) {
            System.out.println("Oops!! Queue is empty, cannot dequeue");
            return;
        }

        System.out.println("Dequeued element: " + front.data);

        front = front.link;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }
    }

    // Show front element
    public void peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front element: " + front.data);
    }

    // Display entire queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node current = front;

        System.out.print("Queue: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.link;
        }

        System.out.println();
    }
}

public class Implement_Queue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();

        int choice;

        do {
            System.out.println("\nPress the following number as per your requirement:");
            System.out.println("1 -> Enqueue");
            System.out.println("2 -> Dequeue");
            System.out.println("3 -> Peek");
            System.out.println("4 -> Display the queue");
            System.out.println("5 -> Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter a value to enqueue:");
                    int x = sc.nextInt();
                    q.enqueue(x);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

        } while (choice != 5);

        sc.close();
    }
}
