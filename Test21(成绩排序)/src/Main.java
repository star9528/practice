import java.util.*;

import static java.lang.reflect.Array.getInt;

public class Main {
    public Map<String,Integer> greatSort (int a,int b,Map<String,Integer> stringMap) {
        if (!stringMap.isEmpty() && stringMap != null) {
            List<Map.Entry<String,Integer>> list = new ArrayList<>(stringMap.entrySet());
            Collections.sort(list,
                    Comparator.comparingInt(Map.Entry::getValue));
            Iterator<Map.Entry<String, Integer>> iter = list.iterator();
            Map.Entry<String, Integer> tmpEntry = null;
            while (iter.hasNext()) {
                tmpEntry = iter.next();
                stringMap.put(tmpEntry.getKey(), tmpEntry.getValue());
            }
        }
        return stringMap;
    }

    @Override
    public String toString() {
        return 
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            for (int i = 0; i < a; i++) {
                String x = in.next();
                int y = in.nextInt();
                map.put(x,y);
            }
            System.out.println(m.greatSort(a,b,map));
        }
    }
}
