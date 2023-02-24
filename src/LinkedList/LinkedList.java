package LinkedList;

public class LinkedList {

    private Node head;

    public Node getHead() {return this.head;}

    public void insertAtHead(int data) {
        Node newNode = new Node (data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public void setHead(Node data) {
        this.head = data;
    }

    public Node deleteFromHead() {
        Node toDel = this.head;
        this.head = this.head.getNextNode();
        return toDel;
    }

    public Node find( int data) {
        Node curr = this.head;
        while (curr != null) {
            if (curr.getData() == data) {
                return curr;
            }
            curr = curr.getNextNode();
        }
        return null;
    }

    public int length() {
        if (head == null)
            return 0;
        int length = 0;
        Node curr = this.head;
        while (curr != null) {
            length += 1;
            curr = curr.getNextNode();
        }
        return length;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public String toString() {
        String res = "{";
        Node curr = this.head;
        while (curr != null) {
            res += curr + ", ";
            curr = curr.getNextNode();
        }
        res += "}";
        return res;
    }

}
