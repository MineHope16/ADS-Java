package Stack;

import java.util.Scanner;

public class StackByArray {
    int[] arr = new int[100];
    int top = -1, size = 100;

    //Push Function
    public void push() {

        if (top == size-1) {
            System.out.println("Stack overflow.\n\n");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to push: ");
        int val = sc.nextInt();
        sc.close();

        top++;
        arr[top] = val;
        System.out.println("Item pushed succcessfully.\n\n");
    }


    //Pop Function
    public void pop() {
        if (top <= -1) {
            System.out.println("Stack underflow.\n\n");
            return;
        }

        System.out.println(arr[top] + " popped.\n\n");
        top--;  
    }

    //Print Stack
    public void disp() {
        if (top <= -1) {
            System.out.println("Stack is empty.\n\n");
            return;
        }

        System.out.println("Stack Elements: ");
        
        for(int i=top; i>=0; i--) {
            System.out.println(arr[i]);
        }

        System.out.println("\n\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackByArray s1 = new StackByArray();

        while(1!=0) {
            System.out.println("Operations: \n1) Push\n2) Pop\n3) Display\n4) Exit\n\n");
            System.out.println("Enter the operation: ");
            int opt = sc.nextInt();
            sc.close();
    
            switch (opt){
            case 1:
                s1.push();
                continue;
    
            case 2:
                s1.pop();
                continue;
    
            case 3:
                s1.disp();
                continue;
    
            case 4:
                break;
    
            default:
                System.out.println("Invalid Option.\nTry Again.\n");
            }
        }
    
    }

}
