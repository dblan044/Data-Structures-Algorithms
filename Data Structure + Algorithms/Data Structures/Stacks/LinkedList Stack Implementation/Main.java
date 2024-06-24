public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(26);
        myStack.push(305);
        myStack.push(1864);
        myStack.push(99999);
        System.out.println("Peek of stack before pop() operation: " + myStack.peek());
        
        myStack.pop();
        System.out.println("Peek of stack after pop() operation: " + myStack.peek());
    }
}