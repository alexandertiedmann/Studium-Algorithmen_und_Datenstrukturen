package main;

import data.Student;
import lists.Listable;
import lists.SinglyLinkedList;
import lists.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Hans","Peter",001,1);
        Student s2 = new Student("Peter","Lustig",002,2);
        Student s3 = new Student("Klein","Kind",003,1);
        Student s4 = new Student("Test","User",004,4);

        //lists.Listable<Student> list = new DoublyLinkedList<Student>();
        Listable<Student> list = new SinglyLinkedList<Student>();
        System.out.println("Die Liste leer:" + list.isEmpty());

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        list.printAll();

        System.out.println(list.getSize());
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list.getSize());
        list.printAll();
        System.out.println("Die Liste leer:" + list.isEmpty());
    }
}
