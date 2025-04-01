package telran;


class Account {
    private int sum = 0;

    // Геттер для получения баланса
    public int getSum() {
        return sum;
    }

    // Метод для увеличения баланса
    public void plusSum(int val) {
        this.sum += val;
    }
}