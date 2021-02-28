package oop.concurrency;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("in my thread at step " + i);
            try {
                Thread.sleep(1000);
                // System.out.println("in my thread at step " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
