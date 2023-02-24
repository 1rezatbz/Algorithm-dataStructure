package LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList integers = new LinkedList();

        integers.insertAtHead(5);
        integers.insertAtHead(10);
        integers.insertAtHead(2);
        integers.insertAtHead(12);
        integers.insertAtHead(19);
        integers.insertAtHead(20);
        integers.deleteFromHead();
        System.out.println(integers);
        System.out.println(integers.length());
        System.out.println(integers.find(12));

    }

}
