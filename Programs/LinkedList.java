
package Programs;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    Node head = null;

    
    void addAtBeginning(int data) {
        Node ptr = new Node(data);

        if (head == null) {
            head = ptr;
        } else {
            ptr.next = head;
            head = ptr;
        }
    }

    void addAtLast(int data) {
        Node ptr = new Node(data);

        if (head == null) {
            head = ptr;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = ptr;
    }

    
    void insertAtPosition(int data, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addAtBeginning(data);
            return;
        }

        Node ptr = new Node(data);
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        ptr.next = temp.next;
        temp.next = ptr;
    }

    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        Node save = null;

        while (temp.next != null) {
            save = temp;
            temp = temp.next;
        }

        save.next = null;
    }

   
    void deleteAtPosition(int pos) {
        if (head == null || pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid position");
            return;
        }

        Node save = temp.next;
        temp.next = save.next;
    }

    void show() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);

        list.addAtBeginning(40);
        list.insertAtPosition(50, 3);

        System.out.println("Before deletion:");
        list.show();

        list.deleteAtEnd();
        list.deleteAtPosition(2);
        list.deleteAtBeginning();

        System.out.println("After deletion:");
        list.show();
    }
}
