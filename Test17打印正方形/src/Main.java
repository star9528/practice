import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            String b = in.next();
            for (int i = 0;i < Math.round((double) a / 2);i++) {//列
                //第一行和最后一行要打印 a 个
                if(i == 0 || i == Math.round((double) a / 2) - 1) {
                    for (int j = 0; j < a; j++) {//行
                        System.out.print(b);
                    }
                    System.out.println();
                } else {
                    //不是第一行就先打印一个,再打印a - 2个空格,在打印一个字符
                    System.out.print(b);
                    for (int j = 1; j < a - 1; j++) {//行
                        System.out.print(" ");
                    }
                    System.out.println(b);
                }
            }
        }
    }
}
