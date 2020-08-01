public class Solution {
    public boolean Find(int target, int [][] array) {
        if (array == null) {
            return false;
        }
        int i = 0;
        int j = array[0].length - 1;
        while (i < array.length && j >= 0) {
            if (array[i][j] == target) {//找到了
                return true;
            } else if (array[i][j] > target) {//排除当前行
                j--;
            } else if (array[i][j] < target) {//排除当前列
                i++;
            }
        }
        return false;
    }
}