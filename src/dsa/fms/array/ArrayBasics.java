package dsa.fms.array;

import java.util.Scanner;

public class ArrayBasics {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		int op = 0;
		int a[] = new int[0];
		while(true) {
			Thread.sleep(300);
			System.out.println();
			System.out.println();
			System.out.println("*************************************************");
			Thread.sleep(200);
			System.out.println("Enter any option : ");
			Thread.sleep(200);
			System.out.println("1. Populate a new array");
			Thread.sleep(200);
			System.out.println("2. Print current array");
			Thread.sleep(200);
			System.out.println("3. Insert an element in array at an index");
			Thread.sleep(200);
			System.out.println("4. Delete an element in array at an index");
			Thread.sleep(200);
			System.out.println("0. Exit");
			Thread.sleep(200);
			//System.out.println("*************************************************");
			op = sc.nextInt();
			
			if(op == 0) {
				break;
			}
			
			if(a.length == 0 && op !=1) {
				System.out.println("Array not initialized !!");
				continue;
			}
			switch(op) {
			case 1:
				a = populateArray();
				break;
			case 2:
				printArray(a);
				break;
				
			case 3:
				a = insertElemAtIdx(a);
				break;
				
			case 4:
				a = deleteAtIdx(a);
			}
		}
		
		
		
		
		
	}

	private static int[] deleteAtIdx(int[] a) {
	
		int b[] = new int[a.length-1];
		System.out.println("Enter index to delete : ");
		int idx = sc.nextInt();
		
		for(int i = 0; i<a.length; i++) {
			if(i < idx) {
				b[i] = a[i];
			}else if( i == idx) {
				continue;
			}else {
				b[i-1] = a[i];
			}
		}
		
		return b;
	}

	private static int[] insertElemAtIdx(int[] arr) {
		System.out.println("Enter the index : ");
		int idx= sc.nextInt();
		System.out.println("Enter elemnet to be inserted : ");
		int elem = sc.nextInt();
		
		int b[] = new int[arr.length+1];
		
		for(int i = 0; i<arr.length+1; i++) {
			if(i < idx) {
				b[i] = arr[i];
			}else if(i == idx) {
				b[i] = elem;
			}else {
				b[i] = arr[i-1];
			}
		}
		return b;
	}

	private static void printArray(int[] arr) {
		System.out.println("Array elements are : ");
		for(int i = 0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static int[] populateArray() {
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements : ");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
}
