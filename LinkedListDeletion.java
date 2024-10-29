package Java_DSA.Problems.Arrays;

class Node {
    int data;
    Node next;

    Node(int value)
    {
        data = value;
        next = null;
    }
}

public class LinkedListDeletion {

    // Function to delete the head node
    public static Node deleteHead(Node head)
    {
        // Base case if linked list is empty
        if (head == null)
            return null;

        // Change the head pointer to the next node
        // and free the original head
        Node temp = head;
        head = head.next;

        // Free the original head (handled by garbage
        // collector)
        temp = null;

        // Return the new head
        return head;
    }

    public static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        // Creating a linked list
        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list: ");
        printList(head);
        // Deleting the head node
        head = deleteHead(head);
        System.out.println(
                "List after deleting the head: ");
        printList(head);
    }
}
