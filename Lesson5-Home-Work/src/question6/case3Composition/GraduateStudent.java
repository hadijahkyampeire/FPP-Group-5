package question6.case3Composition;

public class GraduateStudent {
    int yearOfGraduation;
    Student student;

    public GraduateStudent(String name, int studentId, int yearOfGraduation) {
        student = new Student(name, studentId);
        this.yearOfGraduation = yearOfGraduation;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        GraduateStudent gradStudent = (GraduateStudent) obj;
        return yearOfGraduation == gradStudent.yearOfGraduation && gradStudent.student.equals(student);
    }


}
