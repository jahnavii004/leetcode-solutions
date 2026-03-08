class Solution {
    String soln="";
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        find(nums,set,"",n);
        return soln;
    }
    public void find(String []nums,HashSet<String> set,String ans,int n ){
        if(ans.length() == n){
            if(!set.contains(ans)){
                soln = ans;
                return;
            }
            return;
        }
        find(nums,set,ans+"1",n);
        find(nums,set,ans+"0",n);
    }
}