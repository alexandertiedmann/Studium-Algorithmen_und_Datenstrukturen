package data;

import sort.Comparator;

public class SurnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if ((o1 == null) && (o2 == null)){
            return 0;
        }else if (o1 == null){
            return 1;
        }else if (o2 == null){
            return -1;
        }
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
