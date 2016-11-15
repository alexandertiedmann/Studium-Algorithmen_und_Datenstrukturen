package stack;

public interface Stackable<T> {
    public void push(T data);
    public T pop();
    public boolean isEmpty();
    public int size();
    public T peek(); //erstes Element anschauen ohne zu entnehmen
    public void clear();
    public void print();
}
