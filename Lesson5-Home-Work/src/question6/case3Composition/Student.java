package question6.case3Composition;

public class Student {
    String name;
    int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return s.studentID == studentID && s.name.equals(name);
    }
}
