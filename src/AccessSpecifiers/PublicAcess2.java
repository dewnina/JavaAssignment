package AccessSpecifiers;

public class PublicAcess2 {
    public static void main(String args[])
    {
        PublicAccess o= new PublicAccess();
        o.test();
        o.test1();
        //o.test3(); cannot access
        System.out.println( " in different class in same package");
    }
}
