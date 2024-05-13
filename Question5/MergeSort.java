package com.nasri.Question5;
import com.nasri.Question1.Array1;
public class MergeSort {
    public static void mergeSort(int[] nums,int l, int r){
        if ( l < r){
            int mid = (l+r)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums,mid + 1,r);
            merge(nums,l,mid,r);
        }
    }
    public static void merge(int[] nums,int l,int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] leftArr = new int[n1];
        int[] rightArr= new int[n2];
        for(int x = 0; x < n1; x++){
            leftArr[x] = nums[l + x];
        }
        for(int x = 0; x < n2; x++){
            rightArr[x] = nums[mid + 1+ x];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while(i < n1 && j < n2){
            if (leftArr[i] <= rightArr[j]){
                nums[k] = leftArr[i];
                i++;
            }else{
                nums[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            nums[k] = leftArr[i];
            i++;
            k++;
        }
        while(j < n2){
            nums[k] = rightArr[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        Array1 nums = new Array1(10);
        nums.add(2,8,3,6,9,1,8);
        mergeSort(nums.nums,0,nums.size - 1);
        nums.show();
    }
}
