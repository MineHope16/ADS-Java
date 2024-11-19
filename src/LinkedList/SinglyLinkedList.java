package LinkedList;

import java.util.Scanner;

public class SinglyLinkedList {
    Node head = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    //Adding the element at the first
    public void addFirst() {
        Scanner sc = new Scanner("System.in");
        System.out.print("Enter the number you want to add: ");
        int data = sc.nextInt();

        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Adding the element at the last
    public void addLast() {
        Scanner sc = new Scanner("System.in");
        System.out.print("Enter the number you want to add: ");
        int data = sc.nextInt();

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node curNode = head;

        while(curNode.next!=null){
            curNode = curNode.next;
        }

        curNode.next = newNode;
    }

    //Deleting the element
    public void deleteNode() {
        Scanner sc = new Scanner("System.in");
        System.out.print("Enter the number you want to delete: ");
        int data = sc.nextInt();

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curNode = head;
        Node prNode = curNode;

        while(curNode.data != data) {
            prNode = curNode;
            curNode = curNode.next;
        }

        prNode.next = curNode.next;
    }

    //Displaying the List
    public void dispLL() {
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node curNode = head;
        
        System.out.print("head ->");
        while (curNode != null) {
            System.out.print(curNode.data + " -> "); 
            curNode = curNode.next;           
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();

        while (1 != 0) {
            Scanner sc = new Scanner("System.in");
            System.out.print("1) Add First\n2) Add Last\n3) Delete\n4) Display\n5) Exit\n\nEnter your option (1,2,3,4,5): ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                ll.addFirst();
                continue;
                
                case 2:
                ll.addLast();                    
                continue;

                case 3:
                ll.deleteNode();
                continue;

                case 4:
                ll.dispLL();
                continue;

                case 5:
                break;
            }
        }
    
        }

}
