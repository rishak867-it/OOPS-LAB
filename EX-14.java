import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum of two integers: "
                + obj.add(a, b));

        System.out.print("Enter three integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println("Sum of three integers: "
                + obj.add(x, y, z));

        System.out.print("Enter two decimal numbers: ");
        double p = sc.nextDouble();
        double q = sc.nextDouble();

        System.out.println("Sum of two double values: "
                + obj.add(p, q));

        sc.close();
    }
}
