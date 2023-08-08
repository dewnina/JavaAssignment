package LinkedClassWithParameteres;


public class Class2 {
    public static void main(String[] args) {
        // Calling non-static method from Class1
        Class1 class1 = new Class1();
        int divisionResultInt = class1.divide(10, 2);
        System.out.println("Division (int): " + divisionResultInt);

        float divisionResultFloat = class1.divide(10.0f, 3.0f);
        System.out.println("Division (float): " + divisionResultFloat);

        // Calling static method from Class1
        int multiplicationResultInt = Class1.multiply(5, 4);
        System.out.println("Multiplication (int): " + multiplicationResultInt);

        float multiplicationResultFloat = Class1.multiply(3.0f, 2.5f);
        System.out.println("Multiplication (float): " + multiplicationResultFloat);
    }
}

