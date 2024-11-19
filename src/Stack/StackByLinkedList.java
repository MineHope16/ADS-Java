package Stack;

public class StackByLinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Add by the first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;            
        }

        currNode.next = newNode;        
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;            
        }        

        System.out.println("NULL");
    }


    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        Node prNode = currNode;

        while (currNode.next != null)  {
            prNode = currNode;
            currNode = currNode.next;
        }

        prNode.next = null;

    }


    public static void main(String[] args) {
        StackByLinkedList list = new StackByLinkedList();
        list.addLast(3);
        list.printList();

        list.addLast(4);
        list.printList();

        list.addFirst(2);
        list.printList();

        list.addFirst(1);
        list.printList();

        list.addFirst(1);
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
        list.printList();
    }

}
