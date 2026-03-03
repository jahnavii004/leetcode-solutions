class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> bg=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        com(candidates, target , 0, lst , bg);
          return bg;
    }
    public void com(int []candidate, int target , int i , List<Integer> lst , List<List<Integer>> bg){
        if(target == 0){
            bg.add(new ArrayList<>(lst));
            return;
        }
        for(int idx = i ; idx<candidate.length; idx++){
            if(idx > i && candidate[idx] == candidate[idx-1]){
                continue;
            }
            if(candidate[idx]> target){
                break;
            }
            lst.add(candidate[idx]);
            com(candidate , target-candidate[idx] , idx+1 , lst, bg);
            lst.remove(lst.size()-1);
        }
    }
}