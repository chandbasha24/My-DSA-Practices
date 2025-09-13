class Matrix {
    public static void main(String[] args) {
       
        int row=3;
        int column=3;
        int matrix[][]=new int[row][column];
        int value=1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=value++;
            }
        }
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}