package Java_Sample.LinkedList;

public class Runner {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(4);
        list.insert(47);
        list.insert(64);
        list.find(55);
        list.find(4);
//        list.deleteAtPosition(0);
//        list.insertAtStart(66);
//        list.insert(84);
//        list.insertAtPosition(55,0);

        list.display();

    }
}
