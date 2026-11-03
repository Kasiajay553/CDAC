package com.day2.task_1;

public class Task1Driver {

	public static void main(String[] args) {
        System.out.println("=== TASK 1: CIRCULAR QUEUE VERIFICATION ===");
        CircularQueue queue = new CircularQueue(3);

        // 1. Fill queue to capacity
        queue.enqueue("DocA");
        queue.enqueue("DocB");
        queue.enqueue("DocC");
        queue.display();

        // 2. Attempt enqueue when full (demonstrates overflow protection)
        queue.enqueue("DocD");

        // 3. Dequeue one job (frees slot at index 0)
        String finishedJob = queue.dequeue();
        System.out.println("Finished printing: " + finishedJob);
        queue.display();

        // 4. Enqueue new job (wraps around to index 0, overcoming false overflow)
        queue.enqueue("DocD");
        queue.display();

        // 5. Peek front item
        System.out.println("Next job to print (peek): " + queue.peek());		
		
	}

}
