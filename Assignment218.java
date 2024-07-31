public class Assignment218 {
        public static void main(String[] args) {
            int number = 5;
            int result = multiplyByTwo(number);
            System.out.println(number + " multiplied by 2 is " + result);
        }
        public static int multiplyByTwo(int n) {
            return n << 1;
        }
    }

