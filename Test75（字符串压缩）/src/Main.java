public class Main {

//    public String compress (String str) {
//        // write code here
//        StringBuffer s = new StringBuffer();
//        int count = 1;
//        char temp = str.charAt(0);
//        for (int i = 1; i < str.length(); i++) {
//            if (temp == str.charAt(i)) {
//                count++;
//            } else {
//                s.append(temp);
//                s.append(count);
//                count = 1;
//                temp = str.charAt(i);
//            }
//        }
//        s.append(temp);
//        s.append(count);
//        if (s.length() > str.length()) {
//            return str;
//        } else {
//            return s.toString();
//        }
//    }
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
