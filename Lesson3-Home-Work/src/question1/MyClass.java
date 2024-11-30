package question1;

class MyClass {
    int i;
    float j;
    MyClass() {
      i = 5;
      j = 8.5f;
    }
    MyClass(int x, float y) {
        i=x;
        j=y;
    }
    public static void main(String[] args)
    {
        MyClass myObj= new MyClass();
        System.out.println("myObj.i="+myObj.i+", myObj.j="+myObj.j);
    }
}