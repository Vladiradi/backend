package main;

public interface Calculator<T> {
    T add (T a, T b);
    T sub (T a, T b);
    T multi (T a, T b);
    T devide (T a, T b);
}
