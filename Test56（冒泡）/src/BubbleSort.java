//给定一个整型数组, 实现冒泡排序(升序排序)
import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
        for(int bound = 0;bound < arr.length;bound++){
            //从后往前排
            for(int cur = arr.length - 1;cur > bound;cur--){
                if(arr[cur-1] > arr[cur]){
                   int temp = arr[cur - 1];
                   arr[cur - 1] = arr[cur];
                   arr[cur] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5,6,};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
