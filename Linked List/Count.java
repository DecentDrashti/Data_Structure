import java.util.*;
class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class Count{
    Node first;
    int count;

    public void insertAtFront(int data) {
         Node newNode = new Node(data);
        if(first==null)
        {
            first=newNode;
        }
       
        newNode.link = first;
        first = newNode;
    }
    public int count_c(){
      if(first==null){
         count=0;
         return count;
      }
      Node save=first;
      while(save!=null){
        System.out.println(save.data);
        save=save.link;
        count++;
      }
      return count;
    }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Count l1=new Count();
        System.out.println("enter the value of list");
         l1.insertAtFront(10);
         l1.insertAtFront(20);
         l1.insertAtFront(30);
         l1.insertAtFront(40);
        //  do{
        //     System.out.println("enter the list at position  and enter -1 for exist");
        //     int a=sc.nextInt();
        //     l1.insertAtFront(a);
        //  }while(int a!=-1);
        //int.;
        System.out.print(l1.count_c());
        
    }
}