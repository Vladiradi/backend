package warehouse;

class Ramp {
    private final Integer[] buffer;
    private int count = 0;
    private int putIndex = 0;
    private int takeIndex = 0;
    private boolean loadingFinished = false;

    public Ramp(int capacity) {
        buffer = new Integer[capacity];
    }

    public synchronized void put(int box) throws InterruptedException {
        while (count == buffer.length) {
            wait();
        }
        buffer[putIndex] = box;
        putIndex = (putIndex + 1) % buffer.length;
        count++;
        System.out.println("Unloaded box #" + box);
        notifyAll();
    }

    public synchronized Integer take() throws InterruptedException {
        while (count == 0) {
            if (loadingFinished) return null;
            wait();
        }
        int box = buffer[takeIndex];
        takeIndex = (takeIndex + 1) % buffer.length;
        count--;
        notifyAll();
        return box;
    }

    public synchronized void finishLoading() {
        loadingFinished = true;
        notifyAll();
    }
}