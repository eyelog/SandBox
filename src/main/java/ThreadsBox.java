public class ThreadsBox {

    public static void main(String[] args) {

//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("Главный поток завершен");

        Thread myThread = new Thread(new MyRunnable());
        myThread.start();
        System.out.println("Главный поток завершен");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Поток запущен!");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Поток запущен!");
    }
}
