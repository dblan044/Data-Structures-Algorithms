public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.enqueue(26);
        myQueue.enqueue(305);
        myQueue.enqueue(1864);
        myQueue.enqueue(99999);
        System.out.println("Peek of stack before dequeue() operation: " + myQueue.peek());
        
        myQueue.dequeue();
        System.out.println("Peek of stack after dequeue() operation: " + myQueue.peek());
        
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        System.out.println("Peek of stack after dequeue() operation: " + myQueue.peek());
    }
}