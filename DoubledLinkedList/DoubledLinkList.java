package DoubledLinkedList;


public class DoubledLinkList {
	
		Node header;
		DoubledLinkList(){
			header = new Node();
		}
		//adds to the end of the list
		public void addLast(String item){
			//implement
			
			Node node = header;
			
			if(node == null) {
				node.value = item;
				node.next=null;
				node.previous=null;
			}else {
				
				Node temp = header;
				
				while(temp.next != null) {
					temp = temp.next;
				}
				
				Node node2 = new Node();
				temp.next = node2;
				node2.next=null;
				node2.value =item;
				node2.previous = temp;
				
			}
			
		}
		
		public void addAtStart(String item) {
		
			Node tempNode = header;
			Node node = new Node();
			
			tempNode.previous = node;
			node.next = tempNode;
			node.value =item;
			node.previous=null;
			
			header=node;
		}
		
		public void deleteNode(String item) {
			Node tNode = header;
		
			while(tNode.value != item) {
				tNode = tNode.next;
			}
			Node tNode2 = tNode.next;
			Node tNode3 = tNode.previous;
			
			tNode3.next = tNode2;
			tNode2.previous = tNode3;
			
		}
		
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
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
	
		public static void main(String[] args){
			DoubledLinkList list = new DoubledLinkList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			list.addLast("Phurpa");
			list.addAtStart("Pema");
			list.deleteNode("Harry");
			list.deleteNode("Bob");
			
			System.out.println(list);
		}
}
