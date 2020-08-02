import java.util.Scanner;
public class Main {
    public boolean PalindromicSubstring(String str) {
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if (str.charAt(left)!= str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public int insertTo(String a,String b) {
        int num = 0;

        for(int i = 0;i <= a.length();i++) {
            StringBuffer sb = new StringBuffer(a);
            sb.insert(i,b);
            boolean f = PalindromicSubstring(sb.toString());
            if (f == true) {
                num++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        while(sc.hasNextLine()) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println(m.insertTo(a,b));
        }
    }
}