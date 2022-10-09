import java.util.*;

public class Group_HW_1 {

    static double a, b, c, d, sum, avg;
    static String name;

    public static void getdata() {
        Scanner dis = new Scanner(System.in);
        System.out.println("Enter your name:-");
        name = dis.nextLine();
        System.out.println("Enter four digit:");
        System.out.print("a:");
        a = dis.nextDouble();
        System.out.print("b:");
        b = dis.nextDouble();
        System.out.print("c:");
        c = dis.nextDouble();
        System.out.print("d:");
        d = dis.nextDouble();
    }

    public static void name1() {
        System.out.println("Hello " + name);
    }

    public static void small() {
        if (a < b && a < c && a < d) {
            System.out.println(" Lowest No. = "+a);
        } else if (b < a && b < c && b < d) {
            System.out.println("  Lowest No. = "+b  );
        } else if (c < a && c < b && c < d) {
            System.out.println("  Lowest No. = "+c );
        } else {
            System.out.println("  Lowest No. = "+d) ;
        }
    }


    public static void big() {
        if (a > b && a > c && a > d) {
            System.out.println(  "  Highest No. = "+a);
        } else if (b > a && b > c && b > c) {
            System.out.println("  Highest No. = "+b  );
        } else if (c > a && c > b && c > d) {
            System.out.println("  Highest No. = "+c  );
        } else {
            System.out.println("  Highest No. = "+d  );
        }
    }

    public static void sum() {
        sum = a + b + c + d;
        System.out.println("  Total of the no. is:- " + sum);
    }

    public static void avg() {
        avg = sum / 4;
        System.out.println("  Average of No. is:= " + avg);
    }

    public static void main(String args[]) {
        getdata();
        name1();
        small();
        big();
        sum();
        avg();
    }
}
