// Interface- Any service requirement specification(SRS)
// 100% all methods are public and abstract in interface
// class which implement interface have to provide implementation for all the methods in interface




interface intface   // interface declaration
{
    public void m1(); // by default these methods are abstract
    public void m2();
}

 class interfaces implements intface   // implementing Interface intface using Implement keyword
{
    @Override
    public void m1()
    {

    }

    @Override
    public void m2()
    {

    }

}
