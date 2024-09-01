class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class Linked_List {
    Node first;

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.link = first;
        first = newNode;
    }

    // public void insertInOrder(int data) {
    //    Node newNode = new Node(data);
    //    Node predeccor=first;
    //    Node save=first.link;
    //    if(first==null||newNode.data<=first.data){
    //     newNode.link=first;
    //     first=newNode;
    //     if (first == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     Node save = first;
    //     while (save != null) {
    //         //System.out.print(save.info + " ");
    //         save = save.link;
    //     }
    //     return;
    //    }
    //    //newNode.data=x
    //    while(save!=null){
    //     if(newNode.data>save.data){
    //         predeccor=save;
    //         save=save.link;
    //     }
    //     else{
    //         newNode.link=save;
    //         predeccor.link=newNode;
    //     }
    //    }

    //  }
     int count=0;
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


    // Other methods (e.g., display, append, etc.) go here...

    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.insertAtFront(10);
        list.insertAtFront(20);
        list.insertAtFront(30);
        list.insertAtFront(10);
        list.insertAtFront(20);
        list.insertAtFront(30);
        //list.insertInOrder(22);

        // Display the list
        Node current = list.first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.link;
        }
        System.out.println(list.count_c());
    }
}
