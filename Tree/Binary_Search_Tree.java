class Node
    {
       int data;
       Node left;
       Node right;
    
    //constructor
    public Node(int data) 
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
  }
public class Binary_Search_Tree{
    Node root;
    public Binary_Search_Tree(){
      root=null;
    }
    
     void insert(int data){
        ///Node root;
         root=insertRecord(root,data);
    }
     Node insertRecord(Node root,int data){
       if(root==null){
        root=new Node(data);
        return root;
       }
       if(data<root.data){
        root.left=insertRecord(root.left,data);
       }
       else if(data>root.data){
        root.right=insertRecord(root.right,data);
       }
       return root;
    }
    // public static displayInorder(){
    //     return root;
    //     // if(root.left==null){
    //     //     if(root.right==null){
    //     //         return root;
    //     //     }else{
                
    //     //     }
    //     // }
    // }
}