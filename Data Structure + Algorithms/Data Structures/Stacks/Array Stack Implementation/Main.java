public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push("Diana");
        myStack.push("Lazaro");
        myStack.push("Jose");
        myStack.push("Carlos");
        System.out.println("Peek of stack before pop() operation: " + myStack.peek());
        
        myStack.pop();
        System.out.println("Peek of stack after pop() operation: " + myStack.peek());
    }
}