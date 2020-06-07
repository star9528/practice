import java.util.Scanner;

public class Main {
    public static String delete(String s1,String s2) {
        if (s2.isEmpty()) {
            return "";
        }
        char c1;
        char c2 =  s2.charAt(0);;
        char[] arr1 = new char[s1.length()];
        int n = 0;
        for (int i = 0; i < s1.length();i++) {
            c1 = s1.charAt(i);
            for (int j = 0;j < s2.length();j++) {
                c2 = s2.charAt(j);
                if(c1 == c2) {
                    break;
                }
            }
            if(c1 == c2) {
                continue;
            } else {
                arr1[n] = c1;
                n++;
            }
        }
        String arr2 = "";
        for (int i = 0;i < arr1.length;i++) {
            arr2 = arr2 + arr1[i];
        }
        return arr2;
    }
    public static void main(String[] args) {
//        Main m = new Main();
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.nextLine();
            String b = in.nextLine();
            System.out.println(delete(a,b));
        }
    }
}