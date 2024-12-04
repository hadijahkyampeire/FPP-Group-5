package question6.case1InstanceOf;

public class GraduateStudent extends Student{
    int yearOfGraduation;

    public GraduateStudent(String name, int studentID, int yearOfGraduation) {
        super(name, studentID);
        this.yearOfGraduation = yearOfGraduation;
    }

}
