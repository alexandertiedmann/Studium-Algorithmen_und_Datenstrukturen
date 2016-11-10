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
            newNode.prev = null;
            tail = newNode;
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

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty(){
        Node temp = head;
        if (temp == null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void printAll() {
        System.out.println(this.getClass().getSimpleName());
        Node temp = head;
        //Endlosschleife
        /*while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }*/
    }
}
