import java.util.ArrayList;
/*
Methods for ArrayList implementation of a Stack :
String peek()
void push()
void pop()
 */

public class Stack {
    //declare object of ArrayList
    ArrayList<String> stackArray;
    
    Stack(){
        stackArray = new ArrayList<>();
    }
    
    //peek method to display top element
    public String peek(){
        // check if Stack ArrayList has elements
        if(this.stackArray.size() > 0){
            return stackArray.get(stackArray.size() - 1);
            //-1 accounts for the index
        }else{
            //if stack empty
            return null;
        }
    }
    
    //add data into Stack ArrayList
    public void push(String data){
        this.stackArray.add(data);
    }
    
    //remove element from ArrayList
    public void pop(){
        this.stackArray.remove(stackArray.size() - 1);
    }
}