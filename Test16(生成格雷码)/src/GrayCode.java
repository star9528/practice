import java.util.*;

public class GrayCode {
    public String[] getGray(int n) {
        // write code here
        if (n == 1) {
            String[] arr = new String[2];
            arr[0] = "0";
            arr[1] = "1";
            return arr;
        } else {
            String[] temp = getGray(n - 1);
            String[] result = new String[temp.length * 2];
            for (int i = 0; i < temp.length; i++) {
                result[i] = "0" + temp[i];
            }
            for (int i = 0; i < temp.length; i++) {
                result[i + temp.length] = "1" + temp[temp.length -1 -i];
            }
            return result;
        }
    }

    public static void main(String[] args) {
        GrayCode grayCode = new GrayCode();
        System.out.println(Arrays.toString(grayCode.getGray(2)));
    }
}