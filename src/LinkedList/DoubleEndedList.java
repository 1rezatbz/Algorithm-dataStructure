package LinkedList;

public class DoubleEndedList extends LinkedList {

    private Node tail;

    public Node getTail() {return this.tail;}

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        this.tail.setNextNode(newNode);
        this.tail = newNode;
    }

}
