package LinkedList;

public class DoublyLinkedNode {
    private int data;
    private DoublyLinkedNode nextNode;
    private DoublyLinkedNode previousNode;

    public DoublyLinkedNode(int data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public DoublyLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    public DoublyLinkedNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoublyLinkedNode prevNode) {
        this.previousNode = prevNode;
    }



}
