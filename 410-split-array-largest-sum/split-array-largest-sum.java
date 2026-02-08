class Solution {
    public int splitArray(int[] nums, int k) {
       int low=max(nums);
       int high=sum(nums);
       while(low<=high){
        int mid=low+(high - low)/2;
        if(sub(mid, nums)<=k){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return low;
    }
    public int sub(int mid , int[]nums){
        int sum=0,cnt=1;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }
            else{
                cnt++;
                sum=nums[i];
            }
        }
       return cnt;
    }
    public int max(int nums[]){
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(i,max);
        }
        return max;
    }
    public int sum(int nums[]){
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return sum;
    }
}