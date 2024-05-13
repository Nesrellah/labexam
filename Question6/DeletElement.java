package com.nasri.Question6;

public class DeletElement {
    static void deletElements(int[] nums,int index){
        int[] newArray = new int[nums.length-1];
        for (int i = 0,j = 0;i< newArray.length;i++){
            if(i != index){
                newArray[j++] = nums[i];
            }
        }
        nums = newArray;
        for(int i= 0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        deletElements(nums,2);
    }
}
