import java.util.*;
class Node {
    int data;
    Node link;

     public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class Dupli{

void insertAtLast(int data)
  {
    //creaate a new node
    Node newNode=new Node(data);

    if(first==null)
    {
      //linked list is empty
      first=newNode;
    }
    else
    {
       //ll is not empty
       Node save=first;
       while(save.link!=null)
       {
         save=save.link;
       }
       //set the last node link with the  newNode address
       save.link=newNode;
    }

  }

    // public void findDuplicates(){
    //     for(int i=1;i<=list.size();i++){
    //         for(int j=2;j<=list.size();j++){
    //             if(LinkedList.get(i).equals(LinkedList.get(j))){
    //                 System.out.println("Value of Linkedlist at the"+j+"is duplicate of value at index"+i+"the value is"+LinkedList.get(j));
    //             }
    //         }
    //     }
    // }
    public void removeDuplicates() {
        Node current = first;

        while (current != null) {
            Node save = current;
            while (save.link != null) {
                save=save.link;
                if (save.data == current.data) {
                    // Remove the duplicate node
                    save = save.link;
                } else {
                    save = save.link;
                }
            }
            current = current.link;
        }
    }// Other methods (if needed) can be added here


public void displayLinkedList()
{
    if(first==null){
        System.out.println("Linked list empty che");
    }
    else{
        //Linked list is not empty
        Node save = first;

        //search for the last node address
        while(save.link != null)
        {
            System.out.println(save.info);
            save = save.link;
        }
    }
}
}

    


public class Remove_Duplicate{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        Dupli st=new Dupli();

        // LinkedList<Integer> list = new LinkedList<Integer>();

        // System.out.println("enter the size of list");
        // int n=sc.nextInt();

        System.out.println("enter the value of list");
        for(int i=1;i<=n;i++){
            System.out.println("enter the list at position "+i);
            int a=sc.nextInt();
            st.insertAtLast(a);
        }

        //st.findDuplicates();
        st.removeDuplicates();

        // Print the modified list (without duplicates)
        System.out.println("Modified list after removing duplicates:");
        st.displayLinkedList();

    }
}