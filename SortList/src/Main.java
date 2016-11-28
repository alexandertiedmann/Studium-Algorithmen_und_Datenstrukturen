import data.MatriculationNumberComparator;
import data.PrenameComparator;
import data.Student;
import data.SurnameComparator;
import sort.SelectionSort;
import sort.Sortable;

import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Juergen","Zimmermann",4,1,12345);
        Student s2 = new Student("Manfred","Orgel",4,1,53679);
        Student s3 = new Student("Alexanra","Asche",4,0,38569);
        Student s4 = new Student("Lara","Hermann",4,0,84567);

        List<Student> list = Arrays.asList(s1,s2,s3,s4);
        System.out.println("unsortiert: ");
        printAllStudents(list);

        Sortable<Student> doSort = new SelectionSort<Student>();
        System.out.println("Sortiert nach M-Nr.:");
        doSort.sort(list, new MatriculationNumberComparator());
        printAllStudents(list);

        System.out.println("Sortiert nach Surname:");
        doSort.sort(list, new SurnameComparator());
        printAllStudents(list);

        System.out.println("Sortiert nach Prename:");
        doSort.sort(list, new PrenameComparator());
        printAllStudents(list);
    }

    private static void printAllStudents(List<Student> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println((i+1) + ". " + list.get(i));
        }
    }
}
