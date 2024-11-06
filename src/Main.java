import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter side a");
      double a = scanner.nextDouble();
      System.out.println("Enter side b");
      double b = scanner.nextDouble();
      System.out.println("Enter side c");
      double c = scanner.nextDouble();


      Triangle triangle = new Triangle(a, b, c);
      System.out.println("The area of triangle is = " + triangle.getArea());
    }
}