class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        int n=nums.length;
        int subset=(int)Math.pow(2,n);
        for(int num=0;num<subset ;num++){                   //O(2^n)
            List<Integer> lst=new ArrayList<>();
            for(int i=0; i<n; i++){                     //O(n)
                if((num & (1 << i)) != 0){
                    lst.add(nums[i]);
                }
            }
            list.add(lst);
        }
        return list;                 //sc O(2^n * n)    tc O(2^n * n)
    }
}