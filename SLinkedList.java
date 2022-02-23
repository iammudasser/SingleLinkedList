package DataStructure;

public class SLinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}
	// end of Node class

	public void insertNodeAtTail(int data) {

		Node newNode = new Node(data);

		if (head == null) {

			head = newNode;
		}

		else {
			Node currNode = head;
			while (currNode.next != null) {
				currNode = currNode.next;

			}
			currNode.next = newNode;
		}

	}

	void insertNodeAtHead(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}

		else {

			newNode.next = head;
			head = newNode;

		}

	}

	public int sizeOfList() {

		int counter = 0;

		Node currNode = head;
		while (currNode != null) {

			counter++;
			currNode = currNode.next;

		}
		return counter;
	}

	public void print() {

		Node currNode = head;
		while (currNode != null) {

			System.out.print(currNode.data + "-> ");

			currNode = currNode.next;

		}

		System.out.println("NULL");

	}
}
