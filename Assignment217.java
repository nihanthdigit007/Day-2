import java.util.Scanner;

public class Assignment217 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            int andResult = num1 & num2;
            int orResult = num1 | num2;
            int xorResult = num1 ^ num2;

            System.out.println("Bitwise AND result: " + andResult);
            System.out.println("Bitwise OR result: " + orResult);
            System.out.println("Bitwise XOR result: " + xorResult);
        }
    }

