class Solution {
    public int[] constructTransformedArray(int[] nums) {
       int[]arr=new int[nums.length];
       int n=nums.length;
       for(int i=0;i<n;i++){
        arr[i]=nums[((i + nums[i]) % n + n) % n];
       }
       return arr;
    }
}