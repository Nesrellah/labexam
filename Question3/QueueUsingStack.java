package com.nasri.Question3;

import com.nasri.Question2.StackUsingArray;


public class QueueUsingStack {
    private StackUsingArray stack1 = new StackUsingArray(5);
    private StackUsingArray stack2 = new StackUsingArray(5);

    // Enqueue operation
    void enQueue(int x) {
        // Move all elements from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Push the new element to stack1
        stack1.push(x);

        // Move all elements back to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // Dequeue operation
    int deQueue() {
        if (stack1.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stack1.pop();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
            queue.enQueue(10);
            queue.enQueue(20);
            queue.enQueue(30);
        System.out.println(queue.deQueue());
    }

}
