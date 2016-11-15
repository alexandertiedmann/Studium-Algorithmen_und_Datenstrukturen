package stack;

public class Stack<T> implements Stackable<T>{
    private int size;
    private Node head;
    private class Node{ //private nessted Class (verkettete Liste)
        T data;
        Node next;
    }

    @Override
    public void push(T data) {
        //einfuegen vorne
        Node memorized = head;
        head = new Node();
        head.data = data;
        head.next = memorized;
        size++;
    }

    @Override
    public T pop() {
        //wenn erstes Element null
        if (head == null){
            return null;
        }
        //erstes Element zurueckgeben und Pointer neu setzten
        T obj =  head.data;
        head = head.next;
        size--;
        return obj;
    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
        if (head == null){
            return null;
        }
        return head.data;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public void print() {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
