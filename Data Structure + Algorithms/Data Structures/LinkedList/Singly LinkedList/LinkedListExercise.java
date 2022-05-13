public class LinkedListExercise {
    //node class
    static class Node {
        private Node next;
        private int data;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node head;
    
    //if head is null, create head
    //must loop through the linked list from the head while not at the end
    //add to the end of the linked list by linking the current node to next
    public void append(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        
        current.next = new Node(data);
    }
    
    //add to the begining of the linked list
    //create a newHead Node
    //have the newHead.next = the previous head
    //change the head pointer to = the newHead
    public void prepend(int data){
        Node newHead = new Node(data);
        
        if(head == null){
            head = newHead;
        }else{
            newHead.next = head;
            head = newHead;
        }
    }
    
    public void insert(Node prevNode, int data){
        //must have a previous node to be able to insert
        if(prevNode == null){
            System.out.println("Previous node cannot be null");
            return;
        }
        
        Node newNode = new Node(data);
        //inserting bewtween the previous node and previous' .next node
        newNode.next = prevNode.next;  
        //linking previous.next node to the newNode
        prevNode.next = newNode;
    }
    
    //loop through the linked list just before you find the node that == data
    //have the node before the data unlink from it and point to the datas next node
        //curent.next.next
    public void remove(int data){
        if(head == null){
            return;
        }
        
        //if head is the data we want to delete, cut the head out of the list
        if(head.data == data){
            //setting head to the next value in the linked list
            head = head.next;
            return;
        }
        
        //walk through linked list starting at the head
        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                //cut out the node with the data we are looking for and 
                //link the previouse node to the next node of the data node
                current.next = current.next.next;
                return;
            }
            
            //continue itterating the linked list
            current = current.next;
        }
    }
    
    Node reverse(Node head){
        Node current = head;
        Node next = null;
        Node previous = null;
        
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        return previous;
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
    
    public static void main(String[] args) {
        LinkedListExercise linkedList = new LinkedListExercise();
        
        linkedList.append(2);
        linkedList.append(100);
        linkedList.append(10);
        System.out.println("Appending: " + linkedList.printList());
        
        linkedList.prepend(50);
        System.out.println("Prepending 50: " + linkedList.printList());
        
        linkedList.insert(linkedList.head.next.next, 5000);
        linkedList.insert(linkedList.head.next, 20);
        linkedList.insert(linkedList.head.next, 300);
        System.out.println("Inserting: " + linkedList.printList());
        
        linkedList.remove(300);
        System.out.println("Removing 300: " + linkedList.printList());
        System.out.println("");
        
        head = linkedList.reverse(head);
        System.out.println("Reversed list: " + linkedList.printList());
   }
}
