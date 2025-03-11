package main;

public class AccountInterface<T> implements AccountVisible<T> {
    private T id;      // Поле для id
    private int sum;   // Поле для суммы

    // Конструктор класса
    public AccountInterface(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    // Реализация метода getId из интерфейса
    @Override
    public T getId() {
        return id;  // Возвращаем значение id
    }

    // Реализация метода getSum из интерфейса
    @Override
    public int getSum() {
        return sum;  // Возвращаем значение суммы
    }
}