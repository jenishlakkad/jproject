import java.util.*;

public class Marks_sheet {
    static double per;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Marks_sheet obj=new Marks_sheet();

        System.out.println("Enter your Percentage");
        per = scanner.nextDouble();
        if (per >= 70) {
            System.out.println("You got Distinction grade");
        } else if (per >= 60) {
            System.out.println("You got First grade");

        } else if (per >= 35) {
            System.out.println("You are Pass");
        } else if (per > 100 || per < 0) {
            System.out.println("Invalid percentage");
        } else {
            System.out.println("You are Fail");
        }

    }
}
