import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String[] arr = in.nextLine().split(" ");
            Map<String,Integer> map = new HashMap<>();
            for (int i = 0;i < arr.length;i++) {
                if (map.containsKey(arr[i])) {
                    map.put(arr[i],map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i],1);
                }
            }
            for(Map.Entry<String,Integer> s : map.entrySet()) {
                if (s.getValue() >= arr.length / 2) {
                    int num = Integer.valueOf(s.getKey());
                    System.out.println(num);
                }
            }
        }
    }
}