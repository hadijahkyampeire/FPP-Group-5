package question6.case1InstanceOf;

import java.util.Objects;

public class Student {
    String name;
    int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public boolean equals(Object aStudent) {
        if (aStudent == null) return false; // Null check
        if (!(aStudent instanceof Student)) return false; //
        Student s = (Student) aStudent; // casting
        return studentID == s.studentID && s.name.equals(name);
    }

}
