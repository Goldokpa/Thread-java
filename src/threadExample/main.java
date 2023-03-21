package threadExample;

import  java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sessions (X): ");
        int X = scanner.nextInt();

        System.out.print("Enter the number of threads in the pool (Y): ");
        int Y = scanner.nextInt();

        scanner.close();

        ExecutorService threadPool = Executors.newFixedThreadPool(Y);

        for (int i = 0; i < X; i++) {
            //PrintNumbers task = new PrintNumbers(i + 1);
            // Submit the task to the thread pool
            threadPool.submit(new PrintNumbers());
        }

        // Shutdown the thread pool after submitting all tasks
        threadPool.shutdown();
    }
}