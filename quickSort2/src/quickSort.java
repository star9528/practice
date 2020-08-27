public class quickSort {
    public static int[] sort(int[] arr) {
        Sort(arr,0,arr.length - 1);
        return arr;
    }

    private static void Sort(int[] arr,int i,int j) {
        int left = i;
        int right = j - 1;
        int t = arr[j];
        while (left < right) {
            while (left < right && arr[left] <= t) {
                left++;
            }
            while (left < right && arr[right] >= t) {
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        int temp = arr[j];
        arr[j] = arr[left];
        arr[left] = temp;

        Sort(arr,i,left - 1);
        Sort(arr,left + 1,j);
    }

    public static void main(String[] args) {
        int[] arr = {9,5,2,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
