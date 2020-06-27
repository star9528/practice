import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();
            String res = in.nextLine();
            Map<Character,Integer> map = new HashMap<>();
            for(int i = 0;i<s.length();i++){
                int length = map.getOrDefault(s.charAt(i),0);
                map.put(s.charAt(i),length+1);
            }

            int count = 0;

            for(int j = 0;j< res.length();j++){
                int len = map.getOrDefault(res.charAt(j),0);
                if(len <= 0){
                    count ++;
                }
                map.put(res.charAt(j),len-1);
            }
            if(count == 0){
                System.out.println("Yes" +" " + (s.length()-res.length()));
            }else{
                System.out.println("No"+" " + count);
            }
        }
    }
}
