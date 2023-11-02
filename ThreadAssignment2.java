package LMS2;

public class ThreadAssignment2 {
    private static final Object lock = new Object();
    private static int number = 1;
    private static final int maxNumber = 100;

    public static void main(String[] args) {
        Thread oddThread = new Thread(() -> {
            while (number <= maxNumber) {
                synchronized (lock) {
                    if (number % 2 != 0) {
                        System.out.println("Odd: " + number);
                        number++;
                        lock.notify(); // Notify the evenThread to print
                    } 
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            while (number <= maxNumber) {
                synchronized (lock) {
                    if (number % 2 == 0) {
                        System.out.println("Even: " + number);
                        number++;
                        lock.notify(); // Notify the oddThread to print
                    }
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }
}
