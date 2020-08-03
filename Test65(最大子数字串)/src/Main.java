import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            int count  = 0;//记录数字出现的个数
            int end = 0;//记住连续出现的数字最后一个数字的的位置
            int max = 0;//记录出现最多的次数
            for(int i = 0;i < str.length();i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    count++;
                    if (count > max) {
                        end = i;
                        max = count;
                    }
                } else {
                    count = 0;
                }
            }
            System.out.println(str.substring(end - max + 1,end + 1));
        }
    }
}