public class Assignment26 {
        public static void main(String[] args) {
            // Example matrices
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

            // Check if matrices can be multiplied
            if (matrix1[0].length != matrix2.length) {
                System.out.println("Matrices cannot be multiplied due to incompatible dimensions.");
                return;
            }

            // Initialize the result matrix
            int[][] result = new int[matrix1.length][matrix2[0].length];

            // Perform matrix multiplication
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
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
