package Java_Sample.LinkedList;

public class LinkedList
{
    Node head;

    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null) {
            head = node;
        }else{
            Node n = head;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;
    }

    public void insertAtPosition(int data, int index)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index ==0) {
            insertAtStart(data);
        }
        else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void find(int data)
    {
        Node node = head;
        boolean found = false;
        while(node.next != null && !found)
        {
            if(node.data == data) {
                found = true;
            }
            node = node.next;
        }
        if(found) {
            System.out.println(data+" is found in the list");
        }else{
            System.out.println(data+" is NOT found in the list");
        }
    }

    public void deleteAtPosition(int index)
    {
        if(index ==0)
        {
            head = head.next;
        }else{
            Node n = head;
            Node n1 = null;
            for(int i=0; i<index-1; i++)
            {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }

    public void display()
    {
        Node node = head;
        while(node.next != null) {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.print(node.data+" ");
    }
}
