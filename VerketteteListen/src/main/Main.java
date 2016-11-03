package main;

import data.Student;
import lists.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Hans","Peter",001,1);
        Student s2 = new Student("Peter","Lustig",002,2);
        Student s3 = new Student("Klein","Kind",003,1);

        //lists.Listable<Student> list = new DoublyLinkedList<Student>();
        lists.Listable<Student> list = new SinglyLinkedList<Student>();

        list.add(s1);
        list.add(s2);
        list.add(s3);

        list.printAll();

        System.out.println(list.getSize());
        System.out.println(list.get(2));
    }
}
