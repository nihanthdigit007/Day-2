public class Assignment22 {
        public static void main(String[] args) {

            int[] numbers = {10, 20, 30, 40, 50};

            int n = numbers.length;
            for (int i = 0; i < n / 2; i++) {
                int temp = numbers[i];
                numbers[i] = numbers[n - 1 - i];
                numbers[n - 1 - i] = temp;
            }

            System.out.print("Reversed array: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }

