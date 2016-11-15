package Data;
public class Student {
    private String surname;
    private String prename;
    private int course;
    private int mn;

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", prename='" + prename + '\'' +
                ", course=" + course +
                ", mn=" + mn +
                '}';
    }

    public Student(String surname, String prename, int course, int mn) {
        this.surname = surname;
        this.prename = prename;
        this.course = course;
        this.mn = mn;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getMn() {
        return mn;
    }

    public void setMn(int mn) {
        this.mn = mn;
    }
}
