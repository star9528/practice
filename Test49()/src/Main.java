import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String en = in.nextLine();
            String de = in.nextLine();
            System.out.println(encryption(en));
            System.out.println(decode(de));
        }
    }
    //加密
    public static String encryption(String en){
        char[] c = en.toCharArray();
        for(int i = 0;i < c.length;i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                if (c[i] == 'z'){
                    c[i] = 'A';
                } else {
                    c[i] = (char)(c[i] - 32 + 1);
                }
            } else if (c[i] >= 'A' && c[i] <= 'Z') {
                if (c[i] == 'Z'){
                    c[i] = 'a';
                } else {
                    c[i] = (char)(c[i] + 32 + 1);
                }
            } else if (c[i] >= '0' && c[i] <= '9') {
                if (c[i] == '9'){
                    c[i] = '0';
                } else {
                    c[i] = (char)(c[i] + 1);
                }
            }
        }
        return new String(c);
    }
    //解密
    public static String decode(String de){
        char[] c = de.toCharArray();
        for(int i = 0;i < c.length;i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                if (c[i] == 'a'){
                    c[i] = 'Z';
                } else {
                    c[i] = (char)(c[i] - 32 - 1);
                }
            } else if (c[i] >= 'A' && c[i] <= 'Z') {
                if (c[i] == 'A'){
                    c[i] = 'z';
                } else {
                    c[i] = (char)(c[i] + 32 - 1);
                }
            } else if (c[i] >= '0' && c[i] <= '9') {
                if (c[i] == '0'){
                    c[i] = '9';
                } else {
                    c[i] = (char)(c[i] - 1);
                }
            }
        }
        return new String(c);
    }
}