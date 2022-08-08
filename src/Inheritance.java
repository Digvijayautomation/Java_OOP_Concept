// Inheritance is also known as "Is a" Relationship
// The Biggest advantage is code usability
// extends keyword is used for extending properties of parent class to child class
// types of inheritances are single, multiple, multilevel, hierarchical, hybrid
// multiple and hybrid are not supported by java

    class parent
    {
        public void m1()
        {
            System.out.println("Parent");
        }

    }

     class child extends parent // by extending the parent class, child class can reuse the all the methods in parent

    {
        public void m2()
        {
            System.out.println("Child");
        }

    }

class inheritance_test
{
    public static void main(String[] args) {
        child c = new child();
        c.m1(); // calling parent method from child object
        c.m2();

        parent p =new parent();
        p.m1();
        //p.m2();  this is not possible we can not call methods of child class from parent

    }
    }








