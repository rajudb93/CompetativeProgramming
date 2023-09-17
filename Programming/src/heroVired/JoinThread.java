package heroVired;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1" + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2" + i);
            }
        });


        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //Main thread wait till t1 and t2 is not finished to proceed

        System.out.println("Main thread finished.");
    }
}
