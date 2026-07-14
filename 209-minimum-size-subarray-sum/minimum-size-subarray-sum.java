class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int min = Integer.MAX_VALUE, ans = Integer.MAX_VALUE; int sum=0;
        while(j<nums.length){
            //grow
            sum += nums[j];
            //shrink
            while(i<=j && sum >= target){
                ans = j-i+1;
                sum -= nums[i];
                i++;
            }
            j++;
            min=Math.min(min,ans);
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}