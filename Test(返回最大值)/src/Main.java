import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String s = in.nextLine();
            StringBuffer st = new StringBuffer(s);
            st.delete(0,1);
            st.delete(st.length() - 1,st.length());
            String str1 = st.toString();
            String[] str = str1.split(",");
            int[] arr = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(find(arr));
        }
    }
    public static int find(int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }  return max;
    }

}