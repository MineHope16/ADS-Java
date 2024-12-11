package Stack;

import java.util.Scanner;

public class StackByLinkedLlist {
    Node head = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Adding the element at the last
    public void addLast() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to add to stack: ");
        int data = sc.nextInt();

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            System.out.println("Inserted.\n");
            return;
        }

        Node curNode = head;

        while(curNode.next!=null){
            curNode = curNode.next;
        }

        curNode.next = newNode;
        System.out.println("Inserted.\n");
    }

    //Deleting the element
    public void deleteNode() {    
        if (head == null) {
            System.out.println("stack is empty.\n");
            return;
        }
    
        Node curNode = head;
        Node prNode = null;

        while (curNode.next != null) {
            prNode = curNode;
            curNode = curNode.next;
        }

        prNode.next = null;
        System.out.println("Deleted node with value: " + curNode.data);
    }
    

    //Displaying the List
    public void dispLL() {
        if(head == null) {
            System.out.println("stack is empty.\n");
            return;
        }

        Node curNode = head;
        
        while (curNode != null) {
            System.out.print(curNode.data + " <- "); 
            curNode = curNode.next;           
        }
        System.out.println("null\n");
    }

    

    public static void main(String[] args) {
        StackByLinkedLlist ll = new StackByLinkedLlist();

        while (1 != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("1) Push\n2) Pop\n3) Display\n4) Exit\n\nEnter your option (1,2,3,4): ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                ll.addLast();
                continue;
                
                case 2:
                ll.deleteNode();                    
                continue;

                case 3:
                ll.dispLL();
                continue;

                case 4:
                break;

                default:
                System.out.println("Invalid option.");
                continue;
            }
        }
    
        }

}
