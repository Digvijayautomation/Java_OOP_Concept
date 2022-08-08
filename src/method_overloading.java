// it is type of polymorphism
//method with same name but different argument types

public class method_overloading {

    public void add(int a, int b)
    {
        System.out.println(a+b );
    }

    public void add(float c, int d)
    {
        System.out.println(c+d);
    }

    public void add(float c, float a)
    {
        System.out.println(c+a);
    }

}

class add {
    public static void main(String[] args) {

        method_overloading m=new method_overloading();

        m.add(2,4);  // 1st method to add two int

        m.add(4.5f,5); // 2nd method to add two 1 float and 1 int
        m.add(4.5f,6.7f); // 1st method to add two float

    }
}
