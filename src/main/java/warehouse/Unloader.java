package warehouse;
class Unloader implements Runnable {
    private final int totalBoxes;
    private final Ramp ramp;

    public Unloader(int totalBoxes, Ramp ramp) {
        this.totalBoxes = totalBoxes;
        this.ramp = ramp;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= totalBoxes; i++) {
                Thread.sleep(500);
                ramp.put(i);
            }
            ramp.finishLoading();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}