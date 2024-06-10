
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedList {

    Node head;

    LinkedList() {
        this.head = null;
    }

    void insertionAtHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;

    }

    void insertionAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curNode = head;

        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newNode;
    }

    void insertionAtPostion() {

    }

    void deleteAtHead() {

    }

    void deleteAtEnd() {

    }

    void showData() {
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "-->");
            curNode = curNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();

        obj.insertionAtEnd(2);
        obj.insertionAtEnd(3);
        obj.insertionAtEnd(4);
        obj.insertionAtEnd(5);

        obj.showData();

        obj.insertionAtHead(1);
        obj.showData();
    }
}
