package LMS2;

public class ThreadAssignment1 
{
    private static int[] arr = {1, 20, 50, 15, 30};
    private static double average;

    public static void main(String[] args) {
        Object lock = new Object();

        Thread averageThread = new Thread(() -> {
            synchronized (lock) {
                int sum = 0;
                for (int i = 1; i <= 10; i++) {
                    sum += i;
                }
                average = (double) sum / 10;
                System.out.println("Average: " + average);
                lock.notify(); // Notify the other thread to execute
            }
        });

        Thread squareThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait(); // Wait for the averageThread to finish
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int num : arr) {
                    System.out.println("Square of " + num + ": " + (num * num));
                }
            }
        });

        averageThread.start();
        squareThread.start();
	    
	}

}
