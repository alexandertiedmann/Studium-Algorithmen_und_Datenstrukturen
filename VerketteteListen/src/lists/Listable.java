package lists;
public interface Listable<T>{
    public void add(T data);
    public void insertAt(int index, T data);
    public void remove(int index);
    public T get(int index);
    public boolean isEmpty();
    public void clear();
    public int getSize();
    public void printAll();
    //public ... find(String text);
    //public void sort(String crit);
}
