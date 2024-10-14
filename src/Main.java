import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        QuadricEquation qe = new QuadricEquation(a, b, c);
        double delta = qe.getDiscriminant();
        if (delta > 0) {
            System.out.println("x1 = " + qe.getRoot1() + " x2 = " + qe.getRoot2());
        } else if (delta == 0) {
            System.out.println("x = " + qe.getRoot1());
        } else {
            System.out.println("No roots");
        }
    }
}
