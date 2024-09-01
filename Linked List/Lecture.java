/**  singly linked list
 1)insert node at first position
 2)insert node at last position
 3)insert node at ordered position
 4)delete node at first position
 5)disply the content
 Author:Drashti Ruparelia
 Date:12-07-2024
 */
public class Lecture 
{
    //create a class
    public class Node
    {
       int data;
       Node link;
    
    //constructor
    public Node(int data) 
    {
        this.data = data;
        this.link = null;
    }
  }
  public Node first=null;

  /**function name:void insertAtfirst(int data)
   * this func insert a new node at the first position 
   * return type: void
   * parameter 1:int data this is a value to insert in a newly created node
   */

  void insertAtFirst(int data)
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
       newNode.link=first;
       first=newNode;
    }

  }


  /**function name:void insertAtlast(int data)
   * this func insert a new node at the last position 
   * return type: void
   * parameter 1:int data this is a value to insert in a newly created node
   */

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
  
  
  /**function name:void insertAtOrder(int data)
   * this func insert a new node at the ascending order position 
   * return type: void
   * parameter 1:int data this is a value to insert in a newly created node
   */

  void insertAtOrder(int data)
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
       
       if(newNode.info<=first.info)
       {
         //first position insertion
         newNode.link=first;
         first=newNode;
       }
       else
       {
        //search for the predecessor node
        node save=first;
        while(save.link!=null && newNode.info>=save.link.info)
        {
          save =save.link;
        } 
        newNode.link=save.link
        save.link=newNode;
       }
    }

  }


  void deleteNode(int data){
    if(first==null)
    {
      System.out.println("ll is empty,cant delete given node");
    }
    else
    {
      if(first.info==data)
      {
        //delete a first node
        first=first.link;
      }
      else
      {
         Node save=first;
         Node pred;

         while(save.link!=null && save.info!=data)
         {
           pred=save;
           save=save.link;
         }
         pred.link=save.link;
      }
    }
  }
public void DisplayLinkedList()
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
    //  if(first==null)
    //  {
    //   System.out.println("ll is empty");
    //  }
    //  else
    //  {
      
    //  }
  // }
// }


