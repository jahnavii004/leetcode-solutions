class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target){
                    cnt++;
                }
                if(cnt *2 > j-i+1)
                max++;
            }
        }
        return max;
    }
}