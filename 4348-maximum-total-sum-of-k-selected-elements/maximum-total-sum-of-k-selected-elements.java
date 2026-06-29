class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        boolean multiply=true;
        if(mul <=0 ){
            multiply= false;
        }
        long sum=0;
        for(int i=nums.length-1;i>=0;i--){
            if(k>0){
            if(multiply){
                sum += (long)mul * nums[i];
                mul--;
                if(mul<=0){
                    multiply=false;
                }
            }
            else{
                sum += (long)nums[i];
            }
            k--;
            }
            else{
                break;
            }
        }
        return sum;
    }
}