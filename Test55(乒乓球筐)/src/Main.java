import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.next();
            String b = in.next();
            System.out.println(isContains(a,b));
        }
    }
    public static String isContains(String a,String b){
        if(0 == a.length() && 0 == b.length()){
            return "Yes";
        }
        if(0 == a.length() && 0 != b.length()){
            return "Yes";
        }
        if(0 != a.length() && 0 == b.length()){
            return "No";
        }
        String[] strB = b.split("");
        for (int i = 0;i < strB.length;i++) {
            if (a.contains(strB[i])) {
                a = a.replaceFirst(strB[i],"0");
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}