class Linkedlist{
   static class Node{
       int Data;
       Node next;
       Node(int Data){
         this.data = data;
         this.next =null;
       }    
       Node head;
    }
}
public void insertAtBeginning(int data) {
    Node newNode =new Node(data);
    newNode.next =head;
    head =newNode;
}
public void insertAtEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    Node current = head;
    while (current.next != null) {
        current = current.next;
    }
    current.next = newNode;
}
public void insertAtPosition(int data, int position) {
    if (position == 0) {
        insertAtBeginning(data);
        return;
    }
    
    Node newNode = new Node(data);
    Node current = head;
    for (int i = 0; i < position - 1; i++) {
        if (current == null) {
            throw new IndexOutOfBoundsException("Position out of list bounds");
        }
        current = current.next;
    }
    
    if (current == null) {
        throw new IndexOutOfBoundsException("Position out of list bounds");
    }
    newNode.next = current.next;
    current.next = newNode;
}
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtPosition(15, 2);
        printList(list.head);
    }

    public static void printList(LinkedList.Node head) {
        LinkedList.Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

