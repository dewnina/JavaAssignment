package Static;

public class StaticAndNonStaticExample {
    // Static variable
    static int staticVariable = 10;

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("Inside nonStaticMethod");
        System.out.println("Printing staticVariable from nonStaticMethod: " + staticVariable);
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Inside staticMethod");
        // Creating an instance of the class to call the non-static method
        StaticAndNonStaticExample instance = new StaticAndNonStaticExample();
        instance.nonStaticMethod(); // Calling the non-static method
    }

    public static void main(String[] args) {
        System.out.println("Calling staticMethod from main");
        staticMethod(); // Calling the static method
    }
}

