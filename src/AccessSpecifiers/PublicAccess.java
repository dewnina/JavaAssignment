package AccessSpecifiers;

public class PublicAccess {
    // public variable
    public int a=10;
    protected int c=12;
    private int d=13;

    //
    public void test()
    {
        int b=11; //this is default
        System.out.println("The instance variable declared public "+a);
        System.out.println("The instance variable declared protected "+c);
        System.out.println("Inside the public method");
    }

    protected void test1()
    {
        System.out.println("The instance variable declared protected "+c);
        System.out.println("Inside the protected method");
    }

    private void test3()
    {
        System.out.println("The instance variable declared private "+d);
        System.out.println("Inside the private method");

    }

    public static void main(String args[])
    {
        PublicAccess ob= new PublicAccess();
        ob.test();
        ob.test1();
        ob.test3();
        System.out.println("same class,package");
    }
}
