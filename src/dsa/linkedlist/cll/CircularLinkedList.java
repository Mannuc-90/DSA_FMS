package dsa.linkedlist.cll;

import java.util.Scanner;


public class CircularLinkedList {
	
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}
	
	Node head = null;
	Node tail = null;
	
	public void insertOperation() {

		Scanner sc = new Scanner(System.in);
		String op;
		do {
			System.out.println();
			
			System.out.println("************************************************");
			System.out.println("                    Insertions");
			System.out.println("************************************************");
			System.out.println("Press a for insertion at Begining");
			System.out.println("Press d for insertion at End");
			System.out.println("Press s for insertion at Specific index");
			System.out.println("Press p to print the current list");
			System.out.println("Press q to quit");
			
			System.out.println();
			
			op = sc.nextLine();

			switch (op) {
			case "a":
				insertAtBegining();
				break;

			case "d":
				insertAtEnd();
				break;

			case "s":
				insertAtIndex();
				break;
				
			case "p":
				printList();

			}
		} while (!op.equals("q"));
	}


	public void insertAtEnd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data : ");
		int data = sc.nextInt();
		
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}else {
			tail.next = newNode;
			tail = newNode;
			newNode.next = head;
		}
	}
	
	private void printList() {

		if(head == null) {
			System.out.println("List is empty");
		}else {
			Node tmp = head;
			do {
				System.out.println(tmp.data);
				tmp = tmp.next;
			}while(tmp!=head);
		}
	}

	private void insertAtIndex() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data : ");
		int data = sc.nextInt();
		System.out.println("Enter position : ");
		int p = sc.nextInt();
		
		Node newNode = new Node(data);
		if(head == null) {
			System.out.println("Empty List");
		}else {
			Node tmp = head;
			for(int i = 0; i<p-2; i++) {
				tmp = tmp.next;
			}
			newNode.next = tmp.next;
			tmp.next = newNode;
		}
	}

	private void insertAtBegining() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter data : ");
		int data = sc.nextInt();
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}else {
			newNode.next = head;
			head = newNode;
			tail.next = head;
		}
	
		
	}
	
	public void listOperations() {
		Scanner sc = new Scanner(System.in);
		String op;

		do {
			System.out.println();
			System.out.println("*************************************");
			System.out.println("         List Operations");
			System.out.println("*************************************");
			System.out.println("1. Press i for insertions");
			System.out.println("2. Press d for deletions");
			System.out.println("3. Press p to display final list");
			System.out.println("4. Press q to quit");
			
			op = sc.nextLine();
			
			switch(op) {
			case "i":
				insertOperation();
				break;
				
			case "d":
				deleteOpration();
				break;
			
			case "p":
				printList();
				break;
			}
			
		} while (!op.equals("q"));
	}

	private void deleteOpration() {
		Scanner sc = new Scanner(System.in);
		String op;
		
		do {
			System.out.println();
		System.out.println("********************************************");
		System.out.println("           Deletions");
		System.out.println("********************************************");
		System.out.println("1. Press a to delete from begining");
		System.out.println("2. Press d to delete from end");
		System.out.println("3. Press s to delete from sepecific index");
		System.out.println("4. Press p to print current list");
		System.out.println("5. Press q to quit");
		
		op = sc.nextLine();
		
		switch(op) {
		case "a":
			deleteFromBegining();
			break;
			
		case "d":
			deleteFromEnd();
			break;
			
		case "s":
			deleteFromIndex();
			break;
			
		case "p":
			printList();
		}
		
		}while(!op.equals("q"));
	}

	private void deleteFromIndex() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index : ");
		int p = sc.nextInt();
		if(head == null) {
			System.out.println("List is empty");
		}else {
			Node tmp = head;
			Node ptr = tmp.next;
			for(int i =0; i<p-2 ; i++) {
				tmp = ptr;
				ptr = ptr.next;
			}
			tmp.next = ptr.next;
		}
	}


	private void deleteFromEnd() {
		if(head == null) {
			System.out.println("List is empty");
		}else {
			Node tmp = head;
			Node ptr = tmp.next;
			
			while(ptr.next!=head) {
				tmp = ptr;
				ptr = ptr.next;
			}
			tmp.next = head;
			tail = tmp;
			ptr.next = null;
		}
	}


	private void deleteFromBegining() {

			if(head == null) {
				System.out.println("List is empty");
			}else {
				Node tmp = head;
				tmp = tmp.next;
				head = tmp;
				tail.next = head;
			}
	}


	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.listOperations();
	}
}
