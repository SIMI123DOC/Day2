
package Programs;

class LinkedListNode {
    int data;
    LinkedListNode next;

    LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    LinkedListNode head = null;

    void addAtBeginning(int data) {
        LinkedListNode ptr = new LinkedListNode(data);

        if (head == null) {
            head = ptr;
        } else {
            ptr.next = head;
            head = ptr;
        }
    }

    void addAtLast(int data) {
        LinkedListNode ptr = new LinkedListNode(data);

        if (head == null) {
            head = ptr;
            return;
        }

        LinkedListNode temp = head;

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

        LinkedListNode ptr = new LinkedListNode(data);
        LinkedListNode temp = head;

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

    // Find Middle Node
    void showMiddleNode() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Node: " + slow.data);
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

        LinkedListNode temp = head;
        LinkedListNode save = null;

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

        LinkedListNode temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid position");
            return;
        }

        LinkedListNode save = temp.next;
        temp.next = save.next;
    }

    void show() {
        LinkedListNode temp = head;

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
        list.showMiddleNode();

        list.deleteAtEnd();
        list.deleteAtPosition(2);
        list.deleteAtBeginning();

        System.out.println("After deletion:");
        list.show();
        list.showMiddleNode();
    }
}
