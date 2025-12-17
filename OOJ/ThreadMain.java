class College extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("BMS College of Engineering");
                sleep(10000);
            }
        } catch (Exception e) {}
    }
}

class Dept extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("CSE");
                sleep(2000);
            }
        } catch (Exception e) {}
    }
}

public class ThreadMain {
    public static void main(String[] args) {
        new College().start();
        new Dept().start();
    }
}
