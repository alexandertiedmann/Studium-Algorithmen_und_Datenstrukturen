package lists;

import com.sun.org.apache.xpath.internal.SourceTree;

public class SinglyLinkedList<T> implements Listable<T> {

    private Node head;

    private class Node {
        T data;
        Node next;
    }

    @Override
    public void add(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
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
        int count = 0;
        Node temp = head;
        while ( temp != null){
            if (count == index){
                return temp.data;
            }
            temp = temp.next;
            count++;
        }
        return null;
    }

    public SinglyLinkedList() {

    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public int getSize() {
        int count = 0;
        Node temp = head;
        while ( temp != null){
            count++;
            temp = temp.next;
        }
        return 0;
    }

    @Override
    public void printAll() {
            System.out.println(this.getClass().getSimpleName());
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
    }
}