import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.nextLine();
            String[] str = a.split("_");
            String newStr = str[0];
            for(int i = 1;i < str.length;i++) {
                String s1 = str[i].substring(0,1);
                s1 = s1.toUpperCase();
                String s2 = str[i].substring(1);
                str[i] = s1 + s2;
                newStr = newStr + str[i];
            }
            System.out.println(newStr);
        }
    }
}