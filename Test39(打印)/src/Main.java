
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.nextLine();
            String b = in.nextLine();
            char[] arr = a.toCharArray();
            String temp = "";
            for(int i = 0;i < arr.length;i++) {
                String s = new String(String.valueOf(arr[i]));
                if (!b.contains(s)) {
                    if (!temp.contains(s)) {
                        temp = temp + s;
                    }
                }
            }
            System.out.println(temp.toUpperCase());
        }
    }
}