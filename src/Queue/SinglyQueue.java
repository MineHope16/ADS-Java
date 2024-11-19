package Queue;

import java.util.Scanner;
public class SinglyQueue {

    int[] arr = new int[5];
    int front = 0, rear = -1,size = 5;

    //Enqueue
    public void enqueue () {
        if (rear+1 == size) {
            System.out.println("Queue is full.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to push: ");
        int val = sc.nextInt();

        arr[++rear] = val;
        
    }

    //Display Queue
    public void displayQueue() {
        if (rear == -1) {
            System.out.println("Queue is empty.\n");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + "<-");
        }
        System.out.println("end");
    }

    //Dequeue
    public void dequeue () {
        if (front == -1) {
            System.out.println("Queue is empty.\n");
            return;
        }

        if (front == rear) {
            front = rear = -1;
        } else {
            int last = rear;
            int i = 0;
            while (i != last-1) {
                arr[i] = arr[i+1];
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyQueue s1 = new SinglyQueue();

        while(1!=0) {
            System.out.println("Operations: \n1) Push\n2) Pop\n3) Display\n4) Exit\n\n");
            System.out.println("Enter the operation: ");
            int opt = sc.nextInt();
    
            switch (opt){
            case 1:
                s1.enqueue();
                continue;
    
            case 2:
                s1.dequeue();
                continue;
    
            case 3:
                s1.displayQueue();
                continue;
    
            case 4:
                break;
    
            default:
                System.out.println("Invalid Option.\nTry Again.\n");
            }
        }
    
    }

}
