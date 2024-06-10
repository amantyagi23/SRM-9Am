
public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkList {

    Node head;

    LinkList() {
        this.head = null;
    }

    void insertionAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curNode = head;

        while (curNode != null) {
            curNode = curNode.next;
        }

        curNode.next = newNode;
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
        LinkList obj = new LinkList();

        obj.insertionAtEnd(2);
        obj.insertionAtEnd(3);
        obj.insertionAtEnd(4);
        obj.insertionAtEnd(5);

        obj.showData();
    }
}
