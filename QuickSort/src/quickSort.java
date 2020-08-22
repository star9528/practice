import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0;i < n;i++) {
                arr[i] = in.nextInt();
            }
            toQuickSort(arr ,0,arr.length - 1);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }
    }

    private static void toQuickSort(int[] arr,int a,int b) {
        int i = a;
        int j = b;
        int index = arr[j];
        if (i < j) {
            while (i < j) {
                while (i < j && arr[i] > index) {
                    i++;
                }
                while (i < j && arr[j - 1] < index) {
                    j--;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            int temp = arr[i];
            arr[i] = index;
            arr[j] = temp;

            toQuickSort(arr, 0, i - 1);
            toQuickSort(arr, i + 1, j);
        }
    }
}
