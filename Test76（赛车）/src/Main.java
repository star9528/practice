import java.util.Scanner;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String[] str = in.nextLine().split(" ");
//            int N = Integer.parseInt(str[0]);
//            int P = Integer.parseInt(str[1]);
//            Map<String,Integer> map = new HashMap<>();
//            for (int i = 0;i < N;i++) {
//                String[] str1 = in.nextLine().split(" ");
//                String l = str1[0] + str[1];
//                int t = Integer.parseInt(str1[2]);
//                map.put(l,t);
//
//            }
//        }
//    }
//    public static int find(Map<String,Integer> map,int num) {
//        Stack<Integer> stack = new Stack<>();
//
//    }
//}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s = in.nextLine();
            StringBuffer str = new StringBuffer(s);
            int k = Integer.parseInt(in.nextLine());
            while(k > 0) {
                for (int j=0;j < str.length() - 1;j++) {
                    if (str.charAt(j) > str.charAt(j+1)) {
                        str.delete(j,j+1);
                        j = j - 1;
                        --k;
                        break;
                    }
                    if (j == str.length() - 2 && k >= 1) {
                        str.delete(j - k + 1,j+1);
                    }
                }
            }
            System.out.println(str);
        }
    }
}