public class Main {
    public static void main(String[] args) {
        DoublyLinkedListExercise dLinkedList = new DoublyLinkedListExercise();

        dLinkedList.append(10);
        dLinkedList.append(20);
        dLinkedList.append(350);
        System.out.println("Appending: " + dLinkedList.printList());
        
        dLinkedList.prepend(500);
        System.out.println("Prepending 500: " + dLinkedList.printList());
        
        dLinkedList.insert(dLinkedList.head, 999);
        System.out.println("Inserting 999 after head: " + dLinkedList.printList());
        
        dLinkedList.remove(dLinkedList.head);
        System.out.println("Removing head 500: " + dLinkedList.printList());
        dLinkedList.remove(dLinkedList.tail);
        System.out.println("Removing tail 350: " + dLinkedList.printList());
        dLinkedList.remove(dLinkedList.head.next);
        System.out.println("Removing 10 from the middle: " + dLinkedList.printList());

   }
}
