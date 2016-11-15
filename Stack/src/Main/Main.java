package Main;
import Data.Student;
import stack.Stackable;
import stack.Stack;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Zimmer","Hans",001,12345);
        Student s2 = new Student("Bethoven","Ludwig",002,23486);
        Student s3 = new Student("Bach","Johann",003,34567);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        Stackable<Student> stack = new Stack<Student>();
        stack.push(s1);
        stack.push(s2);
        stack.push(s3);

        stack.print();

        System.out.println("Size: " + stack.size());
        System.out.println("Get: " + stack.pop());
        System.out.println("Size: " + stack.size());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        stack.pop();
        stack.pop();
        System.out.println("Empty? " + stack.isEmpty());
    }

}
