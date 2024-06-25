/*
 Methods for LinkedList implementation of Queue:
int peek()
void enqueue()
void dequeue()
 */
public class Queue {
    Node first;
    Node last;
    int length;
    
    Queue(){
        this.first = null;
        this.last = null;
        this.length = 0;
    }
    
    //display first element in LinkedList
    public int peek(){
        //if LinkedList has elements, return first "in line"
        if(length > 0){
            return first.data;
        }else{
            return -1;
        }
    }
    
    //add to the begining of the LinkedList
    public void enqueue(int data){
        //create Node obj
        Node node = new Node(data);
        
        //if LinkedList is empty, add element
        if(length == 0){
            first = node;
            last = node;
        }else{
            //set the new node to the end of the LinkedList
            last.next = node;
            last = node;
        }
        length++;
    }
    
    //remove from the begining of the LinkedList
    public void dequeue(){
        //if there are elements in the LinkedList, remove the first one
        if(length > 0){
            first = first.next;
            length--;
            
            if(length == 0){
                last = null;
            }
        }
    }
}
