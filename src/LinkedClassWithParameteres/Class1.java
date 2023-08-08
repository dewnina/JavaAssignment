package LinkedClassWithParameteres;
public class Class1 {
    // Non-static method with int parameter
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    // Non-static method with float parameter
    public float divide(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    // Static method with int parameter
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static method with float parameter
    public static float multiply(float a, float b) {
        return a * b;
    }
}
