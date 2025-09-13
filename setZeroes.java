class SetZeroes {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int r[] = new int[row];
        int c[] = new int[col];
        
        // Step 1: Mark rows and columns to be zeroed
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    r[i] = 1; // Mark row i
                    c[j] = 1; // Mark column j
                }
            }
        }

        // Step 2: Set elements to zero based on marks
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (r[i] == 1 || c[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        SetZeroes s = new SetZeroes();

        // Initialize the matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Call the setZeroes method
        s.setZeroes(matrix);

        // Print the modified matrix
        System.out.println("Modified Matrix:");
        printMatrix(matrix);
    }

    // Utility method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
