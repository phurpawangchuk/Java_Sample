package Java_Sample.Problem7.prob1;


public class DoublyLinkedDeleteFirst {
	
	Node header;

	public DoublyLinkedDeleteFirst() {
		header = new Node();
	}
	
	//removes the node at position 1 and returns
	//the string contained in that node
	public String deleteFirst() {
		//implement
		Node temp = header;
		
		header.next = temp;
		temp.next = 
		header = temp;
		
		return null;
	}
	
	public boolean isEmpty() {
		//implement
		return header.next == null;
//		return true;
	}

	// adds to the end of the list
	public void addLast(String item) {
		
		if (header ==null) {
			Node temp = new Node();
			temp.next = null;
			temp.previous = null;
			temp.value = item;
			header = temp;
		} else {
			
//			Node next = header;
//			while (next.next != null) {
//				next = next.next;
//			}
//			Node n = new Node();
//			n.value = item;
//			next.next = n;
//			n.previous = next;
			
			Node temp = header;
			while (temp.next != null) {
				temp = temp.next;
			}
			Node temp2 = new Node();
			
			temp2.previous = temp;
			temp2.next = null;
			temp2.value = item;
			temp.next = temp2;
			
		}

	}
	
	

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		String deleted = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted);
		System.out.println(list);

	}
}
