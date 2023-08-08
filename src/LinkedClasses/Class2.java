package LinkedClasses;

public class Class2 {
    public static void main(String[] args) {
        // Creating an instance of Class1
        Class1 obj = new Class1();

        // Calling non-static method of Class1
        obj.nonStaticMethod();

        // Calling static method of Class1
        Class1.staticMethod();
    }
}