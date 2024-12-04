package question6.case1InstanceOf;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Magic", 61);
        Student s2 = new Student("Magic", 61);
        Student s3 = new Student("Omega", 62);

        GraduateStudent g1 = new GraduateStudent("Magic", 61, 2025);
        GraduateStudent g2 = new GraduateStudent("Omega", 62, 2025);

        System.out.println("s1.equals(s2) is: " + s1.equals(s2)); 						// true
        System.out.println("s2.equals(s3) is: " + s2.equals(s3));

        System.out.println("s1.equals(g1) : " + s1.equals(g1)); 								//true
        System.out.println("g1.equals(s1) : " + g1.equals(s1));
        System.out.println("g2.equals(g1) : " + g2.equals(g1));
        System.out.println(g1 instanceof Student);

    }
}
