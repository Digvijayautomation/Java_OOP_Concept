// abstract means incomplete
// abstract methods only has declaration not implementation
// abstract methods can not have body, that's why after declaration its having ; instead of { }
// we can apply this modifier at class and method level
// if class has minimum 1 abstract method then class should be declared as abstract
// we can not create the object for the abstract class(because this class is not fully implemented)
// we can also declare class as abstract if it does not have any abstract methods
// child class is responsible to provide implementation to parent class methods


abstract class abstract_modifier {
    public abstract int get_number_wheels();  // Abstract method without implementation
}


class bus extends abstract_modifier  // we can not create object directly for abstract class, so we extend it
{
    public int get_number_wheels()
    {
        return 6;
    }
}

class auto extends abstract_modifier  // we can not create object directly for abstract class, so we extend it
{
    public int get_number_wheels()
    {
        return 3;
    }
}

class test
{
    public static void main(String[] args) {
        bus b=new bus();
        System.out.println("Number of Wheels for bus are-" + b.get_number_wheels());

        auto a=new auto();
        System.out.println("Number of Wheels for auto are-"+ a.get_number_wheels());
    }
}

