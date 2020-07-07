import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.LinkedHashMap;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String filePath = in.next();
            int a = filePath.lastIndexOf("\\");
            String fileName = filePath.substring(a + 1);
            int b = in.nextInt();
            String key = fileName + " " + b;
            if (map.containsKey(key)) {
                map.put(key,map.get(key) + 1);
            } else {
                map.put(key,1);
            }

            List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
            Collections.sort(list,new Comparator<Map.Entry<String,Integer>> (){
                @Override
                public int compare (Entry<String,Integer> o1,Entry<String,Integer> o2){
                    if (o2.getValue() - o1.getValue() == 0) {
                        return o1.getValue() - o2.getValue();
                    }
                    return o2.getValue() - o1.getValue();
                }
            });


            int m = 0;
            for (Map.Entry<String,Integer> i : list) {
                m++;
                if ( m <= 8) {
                    String[] str = i.getKey().split(" ");
                    String k;
                    if (str[0].length() > 16){
                        k = str[0].substring(str[0].length() - 16);
                    } else {
                        k = str[0];
                    }
                    String n = str[1];
                    System.out.printf(k + " " + n + " " + i.getValue());
                } else {
                    break;
                }
            }
        }
    }
}