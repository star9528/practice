import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            System.out.println(iConverDateToDay(year,month,day));
        }
    }
    public static int iConverDateToDay(int year,int month,int day){
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int sumDays = 0;
        for (int i = 0;i < month - 1;i++) {
            sumDays = sumDays + days[i];
        }
        sumDays = sumDays + day;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            sumDays = sumDays + 1;
        }
        return sumDays;
    }
}