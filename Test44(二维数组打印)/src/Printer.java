import java.util.*;

public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here
        Queue<Integer> queue = new LinkedList<>();//用于储存数字,方便后面打印
        //先把的右上的三角的数入队列
        for (int k = (n - 1);k >= 0;k--) {//列的起始点
            //把列的起始点给j,作为数组的列,i作为数组的行,同时增加行列坐标,把所在位置的数入队偶咧
            for (int i = 0,j = k;i <= n - 1 && j <= n - 1;i++,j++) {
                queue.offer(arr[i][j]);
            }
        }
        //再把的左下的三角的数入队列
        for (int k = 1;k <= n - 1;k++) {
            for (int i = k,j = 0;i <= n - 1 && j <= n - 1 - k;i++,j++) {
                queue.offer(arr[i][j]);
            }
        }
        int[] newArr = new int[n * n];
        int i = 0;
        while(!queue.isEmpty()) {
            newArr[i] =queue.poll();
            i++;
        }
        return newArr;
    }
}