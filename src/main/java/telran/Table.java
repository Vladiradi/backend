package telran;

class Table {
    private boolean hasPart = false;

    public synchronized void putPart(int partNumber) throws InterruptedException {
        while (hasPart) {
            wait();
        }
        System.out.println("Robot1 put Part N:" + partNumber);
        hasPart = true;
        notify();
    }

    public synchronized void takePart(int partNumber) throws InterruptedException {
        while (!hasPart) {
            wait();
        }
        System.out.println("Robot2 take part N:" + partNumber);
        hasPart = false;
        notify();
    }
}