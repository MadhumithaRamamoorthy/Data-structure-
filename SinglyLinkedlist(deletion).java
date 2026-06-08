public class LinkedListDemo {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    // Helper method to insert at the front
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // Deletion by key
    public void deleteKey(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " -> ");
            tNode = tNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        list.push(7);
        list.push(1);
        list.push(3);
        list.push(2);

        System.out.print("Created List: ");
        list.printList(); // 2 -> 3 -> 1 -> 7 -> null

        list.deleteKey(1); // Delete node with data 1

        System.out.print("List after deletion of 1: ");
        list.printList(); // 2 -> 3 -> 7 -> null
    }
}
