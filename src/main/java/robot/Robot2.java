package robot;
class Robot2 implements Runnable {
    private final int parts;
    private final Table table;

    public Robot2(int parts, Table table) {
        this.parts = parts;
        this.table = table;
    }

    @Override
    public void run() {
        for (int i = 1; i <= parts; i++) {
            try {
                table.takePart(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}