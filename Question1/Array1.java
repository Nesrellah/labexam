package com.nasri.Question1;


public class Array1 {
    public int[] nums;
    int top;
    int maxSize;
    public int size;

    public Array1(int maxSize){
        nums = new int[maxSize];
        this.maxSize = maxSize;
        size = 0;
    }
    public void add(int ...n){
        if (size == maxSize){
            System.out.println("the array is full");
        }
        else {
            for(int i =0;i<n.length;i++){
                nums[top++] = n[i];
                size++;
            }
        }
    }
    public void show(){
        for(int i =0;i <size;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public void search(int num){
        int counter = 0;
        for (int i = 0;i < size;i ++) {
            if (num == nums[i]) {
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("The number is not find");
        }else System.out.printf("The number %d is found, and appears %d times\n",num,counter);
    }

    public static void main(String[] args) {
        Array1 nums = new Array1(10);
        nums.add(2,8,3,6,9,1,8);
        nums.show();
        nums.search(8);
    }

}

