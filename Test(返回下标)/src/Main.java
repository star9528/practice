import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            String[] s = str.split(" ");
            String haystack = s[0];
            String needle = s[1];
            System.out.println(find(haystack,needle));
        }
    }

    private static int find(String haystack, String needle) {
        if (needle.length() == 0 && needle == null) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            int num = 0;
            for (int j = 0; j < needle.length()&&(i+j) <haystack.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                } else {
                    num++;
                    if (num == needle.length()) {
                        return i - num + 2;
                    }
                }
            }
        }
        return -1;
    }
}
