public class DoublyLinkedListExercise {
    //node class
    static public class Node {
        Node next;
        Node previous;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    protected Node head , tail = null;
    
    public void append(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            tail = newNode;
            
            head.previous = null;
            tail.next = null;
        }else{
            //adding to the end of the linkedlist
            tail.next = newNode;
            newNode.previous = tail;
            
            //tail pointer is now the newNode
            tail = newNode;
            tail.next = null;
        }
    }
    
    public void prepend(int data){
        Node newHead = new Node(data);
        
        if(head == null){
            head = newHead;
        }else{
            this.head.previous = newHead;
            newHead.next = this.head;
            head = newHead;
        }
    }
    
    public void insert(Node prevNode, int data){
        //must have a previous node to be able to insert
        if(prevNode == null){
            System.out.println("Previous node cannot be null");
            return;
        }
        
        //allocate a new node
        Node newNode = new Node(data);
        
        //make newNodes next node = to the previous nodes next
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.previous = prevNode;
        
        if(newNode.next != null){
            newNode.next.previous = newNode;
        }
    }
    
    public void remove(Node delete){
        if(head == null || delete == null){
            return;
        }
        
        //if node to delete is the head
        if(head == delete){
            //setting the heads.next to be the new head
            head = delete.next;
            head.previous = null;
        }
        
        //if not at the tail
        if(delete.next != null){
            //setting the node to be delete.next nodes previous = to 
            //the node to deletes previous node
            delete.next.previous = delete.previous;
        }
        
        //if node to be deleted is not the head
        if(delete.previous != null){
            delete.previous.next = delete.next;
        }
    }
    
    public String printList(){
        String result = "";
        
        Node current = head;
        
        if(head == null){
            System.out.println("List is empty");
        }
        
        while(current != null){
            result += current.data;
            
            if(current.next != null){
                result += ", ";
            }
            
            current = current.next;
        }
        
        return result;
    }
}
