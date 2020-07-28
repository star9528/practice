class Sort {
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int end = i - 1;
            while (end >= 0 && key < array[end]) {
                array[end + 1] = array[end];
                end--;
            }
            array[end + 1] = key;
        }
    }
}
