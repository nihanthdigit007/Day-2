public class Assignment25 {

        public static void main(String[] args) {

            int[][] matrix1 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[][] matrix2 = {
                    {9, 8, 7},
                    {6, 5, 4},
                    {3, 2, 1}
            };

            if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
                System.out.println("Matrices must have the same dimensions for addition.");
                return;
            }

            int[][] result = new int[matrix1.length][matrix1[0].length];

            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            System.out.println("Resultant Matrix:");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

