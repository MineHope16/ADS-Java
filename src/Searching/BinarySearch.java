package Searching;
import java.util.Scanner;

public class BinarySearch {
	//Array Declaration
	int size;
	int[] arr;
	
	BinarySearch() {
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
		System.out.print("Elements of the array are: ");
		
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n");
	}
	
	//Binary Search
	public void binarySearch(int num) {
		int mid, st=0, end = size-1;
		
		mid = (st+end)/2;
		
		while (arr[mid]!=num && st<=end) {
			if (num > arr[mid]) {
				st = mid + 1;
			}
			
			else {
				end = mid - 1;
			}
			
			mid = (st+end)/2;
		}
		
		if (arr[mid] == num) {
			System.out.println("Number found at " + (mid+1) + " position");
		}
		else {
			System.out.println("Element not found in the array.");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		BinarySearch obj1 = new BinarySearch();
		obj1.arrayDisplay();
		
		System.out.println("Enter the number you want to search: ");
		int num = sc.nextInt();
		
		obj1.binarySearch(num);
	}
	
	
}
