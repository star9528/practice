public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        sort(array);
        int num = array[array.length / 2];
        int n = 0;
        for(int i = 0;i < array.length;i++) {
            if (num == array[i]) {
                n++;
            }
        }
        if (n > array.length / 2) {
            return num;
        } else {
            return 0;
        }
    }
    public static int[] sort(int[] array) {
        for (int i = 0;i < array.length;i++) {
            for (int j = array.length - 1;j > i;j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
}