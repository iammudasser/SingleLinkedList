package DataStructure;

public class TestList {

	public static void main(String[] args) {

		SLinkedList ss = new SLinkedList();
		ss.insertNodeAtHead(1);
		ss.insertNodeAtHead(100);
		ss.insertNodeAtHead(200);
		ss.insertNodeAtTail(2000);
		ss.print();
		System.out.println();
		System.out.println("size of a list -> " + ss.sizeOfList());



	}

}
