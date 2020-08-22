public class Test   extends Thread{
    public void run() {
        System.out.println("Test run");
    }

    public static void main(String[] args) {
        (new Test()).start();
    }
}
