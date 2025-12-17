class Resource {}

public class DeadlockDemo {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                synchronized (r2) {}
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                synchronized (r1) {}
            }
        });

        t1.start();
        t2.start();
    }
}
