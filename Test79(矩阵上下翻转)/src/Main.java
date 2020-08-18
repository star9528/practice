public class Main {
    public int[][] convert (int[][] matrix) {
        // write code here
        int col = matrix.length;
        int row = matrix[0].length;
        int[][] newArr = new int[col][row];
        for (int i = 0; i < 0; i++) {
            for (int j = 0; j < row; j++) {
                newArr[col - i][row] = matrix[i][j];
            }
        }
        return newArr;
    }
}
