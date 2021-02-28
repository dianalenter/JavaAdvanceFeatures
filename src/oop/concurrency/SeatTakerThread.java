package oop.concurrency;

public class SeatTakerThread extends Thread {
    private int threadIndex = 0;
    private Bench bench;



    public SeatTakerThread(Bench bench, int threadIndex) {
        this.bench = bench;
        this.threadIndex = threadIndex;
    }

    @Override
    public void run() {
        bench.takeASeat(threadIndex);
        bench.synchronizedBlockPrint(threadIndex);
    }
}
