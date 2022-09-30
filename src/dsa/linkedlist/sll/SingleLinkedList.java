package dsa.linkedlist.sll;

import java.util.Scanner;

public class SingleLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void insertAtBegining() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter data : ");
		int data = sc.nextInt();
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	public void insertAtEnd() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data : ");
		int data = sc.nextInt();
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node tmp = head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = newNode;
		}
	}

	public void insertAtIndex() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data : ");
		int data = sc.nextInt();
		System.out.println("Enter position : ");
		int p = sc.nextInt();
		
		if(head == null) {
			System.out.println("List is empty");
		}else {
			Node newNode = new Node(data);
			Node tmp = head;
			for(int i =0; i<p-2; i++) {
				tmp = tmp.next;
			}
			newNode.next = tmp.next;
			tmp.next=newNode;
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
		
		if(head == null) {
			System.out.println("List is empty");
		}else {
		
			System.out.println("enter position to delete");
			int p = sc.nextInt();
			Node tmp = head;
			Node ptr = tmp.next;
			for(int i =0; i<p-2; i++) {
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
			
			while(ptr.next!=null) {
				tmp = ptr;
				ptr = ptr.next;
			}
			tmp.next = null;
		}
		
	}

	private void deleteFromBegining() {
		if(head == null) {
			System.out.println("List is empty");
		}else {
			Node tmp = head;
			tmp = tmp.next;
			head = tmp;
		}
		
	}

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

	public void printList() {

		if (head == null) {
			System.out.println("Linked List is empty ");
		} else {
			int i =0;
			Node tmp = head;
			while (tmp != null) {
				if(i!=0) {
					System.out.print(" --> ");
				}
				System.out.print(tmp.data);
				tmp = tmp.next;
				i++;
			}
		}
	}

	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.listOperations();

	}

}
