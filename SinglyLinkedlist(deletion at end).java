class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    // Method to delete the last node of the linked list
    public static Node deleteAtEnd(Node head) {
        // Case 1: The list is completely empty
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }

        // Case 2: The list contains only one node
        if (head.next == null) {
            System.out.println("Deleted the only node: " + head.data);
            return null; // The list becomes empty
        }

        // Case 3: The list contains multiple nodes
        Node current = head;
        
        // Loop stops when 'current' reaches the second-to-last node
        while (current.next.next != null) {
            current = current.next;
        }

        // 'current.next' is the last node (to be deleted)
        System.out.println("Deleted last node: " + current.next.data);

        // Disconnect the last node by setting second-to-last node's next to null
        current.next = null;

        // Return the unchanged head pointer
        return head;
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a list: 10 -> 20 -> 30 -> null
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.print("Original List: ");
        printList(head);

        // Delete the last element (30)
        head = deleteAtEnd(head);
        System.out.print("After deletion: ");
        printList(head);

        // Delete the next last element (20)
        head = deleteAtEnd(head);
        System.out.print("After deletion: ");
        printList(head);
    }
}
