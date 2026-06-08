class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i=0,j=nums.length-1;
        int l=0,n=nums.length-1;
       int[]arr=new int[nums.length];
        while(i<nums.length && j>=0){
            if(nums[i]<pivot){
                arr[l++]=nums[i];
            }
            if(nums[j]>pivot){
                arr[n--]=nums[j];
            }
            i++;
            j--;
        }
        while(l<=n){
            arr[l++]=pivot;
        }
        return arr;
    }
}