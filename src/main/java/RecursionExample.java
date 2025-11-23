public class RecursionExample {

    static int  count = 0;

    public static void main(String[] args) {
        inc();
    }

    public static synchronized void inc() {
        if (count < 10) {
            count++;
            inc();
        }

        System.out.println("cont: " + count);
    }
}
