package heroVired;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MathOperation op=(a,b)->a+b;
        System.out.println("Sum of two numbers="+op.calculate(5,4));

        op=(a,b)->a-b;
        System.out.println("Substraction  of two numbers="+op.calculate(23,4));
    }
}
