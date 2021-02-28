package oop.concurrency;

public class Bench {
    Integer availableSeats;

    public Bench(Integer availableSeats) {
        this.availableSeats = availableSeats;

    }

    public synchronized void takeASeat(Integer threadIndex) {  //synchronized method

        if (availableSeats > 0) {
            System.out.println("Take a seat from thread " + threadIndex);
            availableSeats--;
            System.out.println("Free seats left: " + availableSeats + " in thread " + threadIndex);
        } else {
            System.out.println("There are no availible seats in thread " + threadIndex);
        }
    }

    public void synchronizedBlockPrint(Integer threadIndex) {
        synchronized (this) {
            System.out.println("in synced blocked. " + threadIndex); //bloc sincronizat
        }
        System.out.println("Not synchronized code. " + threadIndex);
    }
}
