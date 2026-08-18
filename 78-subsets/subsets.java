class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        int n=nums.length;
        int subset=(int)Math.pow(2,n);
        for(int num=0;num<subset ;num++){
            List<Integer> lst=new ArrayList<>();
            for(int i=0; i<n; i++){
                if((num & (1 << i)) != 0){
                    lst.add(nums[i]);
                }
            }
            list.add(lst);
        }
        return list;
    }
}