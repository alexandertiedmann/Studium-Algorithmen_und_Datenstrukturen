package lists;
public interface Listable<T>{
    public void add(T data);
    public void insertAt(int index, T data);
    public void remove(int index);
    public T get(int index);
    public boolean isEmpty();
    void clear();
    int getSize();
    void printAll();
    //T find(String text);
    //void sort(String crit);
}
