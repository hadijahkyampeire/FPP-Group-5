package question6.case2SameClass;

// Making it final will prevent further inheritance
final public class GraduateStudent extends Student {
    int yearOfGraduation;

    public GraduateStudent(String name, int studentID, int yearOfGraduation) {
        super(name, studentID);
        this.yearOfGraduation = yearOfGraduation;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        GraduateStudent other = (GraduateStudent) obj;
        return yearOfGraduation == other.yearOfGraduation && super.equals(other);
    }

}
