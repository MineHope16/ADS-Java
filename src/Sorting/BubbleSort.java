package Sorting;
import java.util.Scanner;

public class BubbleSort {
	//Array Declaration
	int size;
	int[] arr;
	
	BubbleSort() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of array: ");
		this.size = sc.nextInt();
		this.arr = new int[size];
		
		System.out.println("Enter the elements of array:\n");
		for (int i = 0; i < size; i++) {
			this.arr[i] = sc.nextInt();
		}
		System.out.println("\n");
	}
	
	//Array Display Function 
	public void arrayDisplay() {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n");
	}
	
	//Bubble Sort
	public void bubbleSort() {
		for (int i = 0; i < size; i++){
	        for(int j = 0; j < size-i-1; j++){
	            if (arr[j]>arr[j+1]){
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	            }
	        }
	    }		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		BubbleSort obj1 = new BubbleSort();
		System.out.println("Array before sort: ");
		obj1.arrayDisplay();
		
		obj1.bubbleSort();
		
		System.out.println("Array after sort: ");
		obj1.arrayDisplay();
	}
	
	
}
