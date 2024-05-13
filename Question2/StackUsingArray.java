package com.nasri.Question2;

import com.nasri.DSA.stckss.Stack;

public class StackUsingArray {
    private int top = 0;
    int[] nums;
    int maxSize;
    int size;
    public boolean isFull(){
        return size == maxSize;
    }
    public StackUsingArray(int maxSize){
        nums = new int[maxSize];
        size = 0;
        this.maxSize = maxSize;

    }
    public void push(int data){
        if (isFull()){
            System.out.println("The stack is full");
        }else{
            nums[top++] = data;
            size++;

        }
    }
    public int pop(){
        if(isEmpty()) return -1;
        else {
            size--;
            return nums[--top];
        }
    }
    void peek(){
        if (isEmpty()) System.out.println("You can't peek the stack is empty");
        else System.out.println(nums[top-1]);
    }
    void size(){
        System.out.printf("The size of the stack is %d\n", size);
    }
    void show(){
        for(int i =0; i < size; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(4);
        stack.push(12);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        System.out.println(stack.pop());
        stack.show();
        stack.size();

    }

}
