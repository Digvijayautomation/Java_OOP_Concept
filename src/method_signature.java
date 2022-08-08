// method signature contain method name and types of arguments like in below code
// two methods with the same signature are not allowed


public class method_signature {

    public int m1(int a) // here method signature is m1(int a)
    {

        return a;
    }

    public double m2(double b)  // here method signature is m1(double b)
    {
       return b;
    }

    public float m3( float y)
    {
      return y;
    }
    public static void main(String[] args) {
        method_signature m=new method_signature();

        int m1=  m.m1(40); // m1 only accept int because is signature is m1(int a)
        System.out.println(m1);

       double m2=  m.m2(221212); // m2 only accept double because is signature is m2(double b)
        System.out.println(m2);

        float m3=   m.m3(3.4f); // m3 only accept float value because is signature is m3( float y)
        System.out.println(m3);



    }
}


