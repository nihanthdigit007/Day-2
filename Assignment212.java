import java.util.Scanner;
public class Assignment212 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            double area = Math.PI * radius * radius;
            double circumference = 2 * Math.PI * radius;

            System.out.println("Area: " + area);
            System.out.println("Circumference: " + circumference);
        }
    }

