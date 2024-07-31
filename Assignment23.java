public class Assignment23 {

        public static void main(String[] args) {

            int[] numbers = {10, 21, 32, 43, 54, 65, 76, 87, 98};

            int evenCount = 0;
            int oddCount = 0;

            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println("Number of even elements: " + evenCount);
            System.out.println("Number of odd elements: " + oddCount);
        }
    }

