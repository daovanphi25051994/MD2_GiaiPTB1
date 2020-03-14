import java.util.Scanner;

public class GiaiPTB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        System.out.println("a = ");
        double a = scanner.nextDouble();
        System.out.println("b = ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Pt vo so nghiem");
            } else {
                System.out.println("Pt vo nghiem");
            }
        } else {
            double result = -b / a;
            System.out.println("Pt co nghiem x = " + result);
        }
    }
}
