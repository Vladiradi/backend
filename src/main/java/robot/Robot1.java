package robot;
class Robot1 implements Runnable {
    private final int parts;
    private final Table table;

    public Robot1(int parts, Table table) {
        this.parts = parts;
        this.table = table;
    }

    @Override
    public void run() {
        for (int i = 1; i <= parts; i++) {
            try {
                table.putPart(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}