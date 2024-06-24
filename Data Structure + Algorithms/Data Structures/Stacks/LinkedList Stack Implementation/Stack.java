/*
Methods for LinkedList implementation of a Stack :
String peek()
void push()
void pop()
 */

public class Stack {
    Node top;
    Node bottom;
    int length;
    
    Stack(int length){
        this.top = null;
        this.bottom = null;
        this.length = 0;
        
    }
    
        //peek method to display top element in LinkedList
        public int peek(){
           //check if list has elements
           if(length > 0){
               return top.data;
           }else{
               return -1;
           }
        }
        
        //add data into LinkedList
        public void push(int data){
            //create Node obj
            Node node = new Node(data);
            
            //if the list is empty, Node will be both top and bottom
            if(length == 0){
                top = node;
                bottom = node;
            }else{
                //link new node to be top to current top
                node.next = top;
                top = node;
            }
            length++;
        }
        
        //remove element from LinkedList
        public void pop(){
            //if there are nodes in the list, remove elemetn
            if(length > 0){
                top = top.next;
                
                //if there is only one elememt, remove it by nullification
                if(length == 1){
                    bottom = null;
                }
            }
            length--;
        }
}
