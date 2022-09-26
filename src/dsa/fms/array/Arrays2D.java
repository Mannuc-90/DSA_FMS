package dsa.fms.array;

import java.util.Scanner;

public class Arrays2D {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		int op = 0;
		int a[][] = new int[0][];
		while (true) {
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
			System.out.println("0. Exit");
			Thread.sleep(200);
			// System.out.println("*************************************************");
			op = sc.nextInt();

			if (op == 0) {
				break;
			}

			if (a.length == 0 && op != 1) {
				System.out.println("Array not initialized !!");
				continue;
			}

			switch (op) {
			case 1:
				 a = populateArray();
				 break;
				 
			case 2:
				printArr(a);
			}
		}
	}

	private static void printArr(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		
		for(int i =0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		
	}

	private static int[][] populateArray() {
		System.out.println("Enter number of rows : ");
		int n = sc.nextInt();
		System.out.println("Enter number of columns : ");
		int m = sc.nextInt();
		
		int a[][] = new int[n][m];
		
		System.out.println("Enter values : ");
		for(int i =0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}
	
	
}
