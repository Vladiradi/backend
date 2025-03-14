package main;

public class MemoryInfo {
    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory(); // Максимальная доступная память
        long allocatedMemory = Runtime.getRuntime().totalMemory(); // Выделенная память
        long freeMemory = Runtime.getRuntime().freeMemory(); // Свободная память

        System.out.println("Максимальная память JVM: " + (maxMemory / 1024 / 1024) + " MB");
        System.out.println("Выделенная память: " + (allocatedMemory / 1024 / 1024) + " MB");
        System.out.println("Свободная память: " + (freeMemory / 1024 / 1024) + " MB");
    }
}