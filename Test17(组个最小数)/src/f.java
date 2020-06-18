public class f {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("您调用main方法时没有指定任何参数！");
            return;
        }
        System.out.println("您调用main方法时指定的参数包括：");
        for (int i = 0; i < args.length; i++) {
            System.out.println("参数" + (i + 1) + "的值为：" + args[i]);
        }
    }

}
