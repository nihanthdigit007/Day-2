public class Assignment219 {
        public static void main(String[] args) {
            int number = 5; // You can change this to any number you want to check
            if (isEven(number)) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }

        public static boolean isEven(int n) {
            return (n & 1) == 0;
        }
    }
