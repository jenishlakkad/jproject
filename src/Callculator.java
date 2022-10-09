public class Callculator {



    static int x = 4;
    static int y = 9;

    public static void add() {
        System.out.println("Addition of x and y is: " +(x + y) );
    }
    public static void sub() {

        System.out.println("Subtraction of x and y is: " + (x - y));
    }
    public static void mul() {

        System.out.println("Multiplication of x and y is: " + (x * y));
    }
    public static void div() {
        System.out.println("Division of x and y is: " +  (x / y));
    }
    public static void main(String[] args) {
        add();
        sub();
        mul();
        div();
    }
}
