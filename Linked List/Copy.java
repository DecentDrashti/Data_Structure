import java.util.*;
class Node {
    int info;
    Node link;
     Node(){
        this.link=null;
     }
     public Node(int info) {
        this.info = info;
        this.link = null;
        
    }
    
}
public class Copy{

    public static void main(String[] args) {
LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("original list:"+list);
        list.copy_LL();
        System.out.println("copied list:"+list);
        //list.displayLinkedList();
  }


public void copy_LL(){
    // Node newNode= new Node();
    //Node first=null;
    Node pred=null;
    Node save=first;
    while(save.link!=null){
        Node n=new Node(save.info);
        pred.link=n;
        pred=n;
        save=save.link;
        Node begin=newNode.link;
    }
} 
}
//  public void displayLinkedList()
// {
//     if(first==null){
//         System.out.println("Linked list empty che");
//     }
//     else{
//         //Linked list is not empty
//         Node save = first;
        
//         //search for the last node address
//         while(save!= null)
//         {
//             System.out.println(save.info);
//             save = save.link;
//         }
//         //save.link=newNode
//     }
//  }
        

    // Node first=null;
    // //int field;
    // Node begin=null;
    // Node pred;
    // Node save=first;
    // public void copy(){
    //     Node newNode=new Node(data);
    //     if(first==null)
    //     return;
    //     if(save==null){
    //         System.out.println("underflow");
    //     }else{
    //         newNode=save;
    //         save=save.link;
    //         newNode.data=first.data;
    //         begin=newNode;
    //     }
    //     while(save!=null){
    //         pred=newnode;
    //         save=save.link;
    //         if(save=null){
    //             System.out.println("underflow");
    //         }else{
    //             newNode=save;
    //             save=save.link;
    //             new.info=save.info;
    //             pred.link=newNode;
    //             newNode.link=null;
    //             return;
    //         }
    //     }

    
    