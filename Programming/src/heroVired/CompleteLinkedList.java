package heroVired;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int search(int key) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == key) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; // Element not found
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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

    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteFromEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
    }

    public void delete(int key) {
        if (head == null) {
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node prev = null;
        Node current = head;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class CompleteLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtBeginning(5);
        linkedList.insertAtEnd(30);
        linkedList.insertAtBeginning(2);

        System.out.println("Linked List elements:");
        linkedList.display();

        System.out.println("Is the linked list empty? " + linkedList.isEmpty());

        int searchElement = 20;
        int index = linkedList.search(searchElement);
        if (index != -1) {
            System.out.println(searchElement + " found at index: " + index);
        } else {
            System.out.println(searchElement + " not found in the linked list.");
        }

        linkedList.deleteFromBeginning();
        linkedList.deleteFromEnd();
        linkedList.delete(10);

        System.out.println("Linked List after deletions:");
        linkedList.display();
    }
}
