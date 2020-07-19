import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String s = in.nextLine();
            String[] str = s.split(";");
            int x = 0;
            int y = 0;
            for (int i = 0;i < str.length;i++) {
                boolean f = false;
                if (str[i].length() == 3 && (str[i].charAt(1) >= '0' && str[i].charAt(1) <= '9')
                        && (str[i].charAt(2) >= '0' || str[i].charAt(2) <= '9')) {
                    f = true;
                }
                if (str[i].length() == 2 && (str[i].charAt(1) >= '0' && str[i].charAt(1) <= '9')) {
                    f = true;
                }
                if (str[i].charAt(0) == 'A' || str[i].charAt(0) == 'D' || str[i].charAt(0) == 'W' ||
                        str[i].charAt(0) == 'S') {
                    if (f == true) {
                        if (str[i].charAt(0) == 'A') {
                            int step = Integer.parseInt(str[i].substring(1));
                            x = x - step;
                        }
                        if (str[i].charAt(0) == 'D') {
                            int step = Integer.parseInt(str[i].substring(1));
                            x = x + step;
                        }
                        if (str[i].charAt(0) == 'W') {
                            int step = Integer.parseInt(str[i].substring(1));
                            y = y + step;
                        }
                        if (str[i].charAt(0) == 'S') {
                            int step = Integer.parseInt(str[i].substring(1));
                            y = y - step;
                        }
                    }
                }
            }
            System.out.println(x + "," + y);
        }
    }
}