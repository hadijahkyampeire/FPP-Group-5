package question6.case2SameClass;

// This cares about the same class
public class Test {
    public static void main(String[] args) {
        Student p1 = new Student("Hajj",123);
        Student p2 = new Student("Hajj",123);
        Student p3 = new Student("Victor",234);
        System.out.println("p1.equals(p2) : " + p1.equals(p2));
        System.out.println("p2.equals(p3) : " + p2.equals(p3));

        GraduateStudent pj1 = new GraduateStudent("John",123,5000);
        GraduateStudent pj2 = new GraduateStudent("John",123,5000);
        System.out.println("pj1.equals(pj2) : " + pj1.equals(pj2));
        System.out.println("pj1.equals(p1) : " + pj1.equals(p1)); // False because different class
    }
}
