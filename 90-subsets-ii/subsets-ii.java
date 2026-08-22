class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        int n=nums.length;
        int subsets =(int) Math.pow(2,n);
        for(int i= 0;i<subsets;i++){
            List<Integer> lst=new ArrayList<>();
            for(int bit=0;bit<n;bit++){
                if((i  & (1 << bit)) != 0){
                    lst.add(nums[bit]);
                }
            }
            set.add(lst);
        }
        List<List<Integer>> list=new ArrayList<>();
        for(List<Integer> lt:set){
            list.add(lt);
        }
        return list;
    }
}