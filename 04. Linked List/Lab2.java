//Lab 2: Writing Linked List code

public class Lab2 {
    public static void main(String[] args) {
        // Test size method
        System.out.println("Testing size method:");
        CP3LinkedList<String> list1 = new CP3LinkedList<>();
        System.out.println("Empty list size: " + list1.size());
        list1.addFirst("A");
        list1.addFirst("B");
        System.out.println("List size after adding 2 elements: " + list1.size());

        // Test contains method
        System.out.println("\nTesting contains method:");
        System.out.println("Contains 'A': " + list1.contains("A"));
        System.out.println("Contains 'Z': " + list1.contains("Z"));

        // Test queue functionality
        System.out.println("\nTesting queue functionality:");
        CP3LinkedList<Integer> queue = new CP3LinkedList<>();
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        System.out.println("Queue elements:");
        queue.print();

        // Test doubly-linked list
        System.out.println("\nTesting doubly-linked list:");
        CP3LinkedList<String> list2 = new CP3LinkedList<>();
        list2.addFirst("First");
        list2.addLast("Last");
        System.out.println("List elements:");
        list2.print();

        // Test removing elements
        System.out.println("\nRemoving first element:");
        list2.removeFirst();
        list2.print();
    }
}