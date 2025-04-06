package warehouse;
import java.util.concurrent.atomic.AtomicInteger;
class Loader implements Runnable {
    private final Ramp ramp;
    private final int id;
    private final AtomicInteger count = new AtomicInteger(0);

    public Loader(Ramp ramp, int id) {
        this.ramp = ramp;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer box = ramp.take();
                if (box == null) break;

                System.out.println("Loader #" + id + " took box #" + box);
                count.incrementAndGet();
                Thread.sleep(800);
            }
            System.out.println("✅ Loader #" + id + " done. Boxes moved: " + count.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}