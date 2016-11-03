package lists;

public class DoublyLinkedList<T> implements Listable<T> {

    private Node head;
    private Node tail;

    private class Node {
        T data;
        Node next;
        Node prev;
    }

    @Override
    public void add(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null){
            head = newNode;
        }else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    @Override
    public void insertAt(int index, T data) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    public DoublyLinkedList() {

    }

    @Override
    public void clear() {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void printAll() {

    }
}
