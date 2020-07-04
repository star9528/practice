import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt(); //数据的个数
            float sum1 = factorial(n);
            float sum2 = count(n);
//将得到的分子分母进行相除，就可以得到概率了。
            float result1 = (sum2/sum1)*100;
            System.out.println(String.format("%.2f%%", result1) );
        }
    }
    /**
     * 错排算法
     */
    public static float count(int n) {
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            return (n-1)*(count(n-1)+count(n-2));
        }
    }
    /**
     * n的阶乘
     */
    public static float factorial(int num) {
        float result = 1;
        if(num==0){
            return 1;
        }else if (num > 0) {
            result = num * factorial(num - 1);
        }
        return result;
    }
}