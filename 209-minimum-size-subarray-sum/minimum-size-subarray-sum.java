class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int min = Integer.MAX_VALUE, ans = Integer.MAX_VALUE; int sum=0;
        while(j<nums.length){
            //grow
            sum += nums[j];
            j++;
            //shrink
            if(sum >= target){
                ans = j-i;
            }
            while(i<=j && sum > target){
                sum -= nums[i];
                i++;
                if(sum >= target){
                ans = j-i;
                }
            }
            min=Math.min(min,ans);
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}