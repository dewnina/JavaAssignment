package AccessSpecifiers2;
import AccessSpecifiers.*;

public class PublicSpecifier extends PublicAccess{
    public static void main(String args[])
    {
        PublicAccess ok= new PublicAccess();
        ok.test();
        PublicSpecifier okj=new PublicSpecifier();
        okj.test1();
        System.out.println("in different class and package");
    }
}
