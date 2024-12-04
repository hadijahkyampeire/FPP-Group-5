package question6.case3Composition;

import question6.case2SameClass.Student;

public class Test {
    public static void main(String[] args) {
        GraduateStudent pj1 = new GraduateStudent("John",123,5000);
        GraduateStudent pj2 = new GraduateStudent("John",123,5000);
        GraduateStudent pj3 = new GraduateStudent("Jane",234,6000);
        System.out.println("pj1.equals(pj2) : " + pj1.equals(pj2));
        System.out.println("pj2.equals(pj3) : " + pj1.equals(pj3));
    }
}
