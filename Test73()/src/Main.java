import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例

            String n = in.nextLine();
            int T = Integer.parseInt(n);
            String[] str = new String[T];
            for (int i = 0;i < T;i++) {
                str[i] = in.nextLine();
            }
            for (int i = 0; i < T; i++) {
                String[] str2 = str[i].split(" ");
                System.out.println(play(str2));
            }
        }
    }
    public static String play(String[] str2) {
        Map<String,String> map = new HashMap<>();
        for (int j = 0;j < str2.length;j++) {
            String[] t = str2[j].split("");
            map.put(t[0],t[1]);
        }
        int tNum = 0;
        int wNUm = 0;
        int bNum = 0;
        if (map.size() < 7) {
            return "NO";
        }
        map.clear();
        return "YES";
//        Set<Map.Entry<String,String>> set = map.entrySet();
//        for(Map.Entry<String,String> s : set) {
//            if(map.get(s) == "T") {
//                tNum++;
//            }
//            if(map.get(s) == "W") {
//                wNUm++;
//            }
//            if(map.get(s) == "B") {
//                bNum++;
//            }
//        }
//        map.clear();
//        if ((tNum==3&&wNUm==3&&bNum==1)||
//                (tNum==3&&wNUm==1&&bNum==3)||
//                (tNum==1&&wNUm==3&&bNum==3)) {
//            return "YES";
//        } else {
//            return "NO";
//        }
    }
}