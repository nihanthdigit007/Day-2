import java.util.Scanner;

public class Assignment214 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println("The number " + number + " is divisible by both 5 and 7.");
            } else {
                System.out.println("The number " + number + " is not divisible by both 5 and 7.");
            }
        }
    }

