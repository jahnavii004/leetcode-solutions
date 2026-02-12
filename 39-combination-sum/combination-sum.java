class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> bg=new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Com(candidates , target , ans , 0 , bg);
        return bg;
    }
    public static void Com(int []coin , int amt  , List<Integer> ans , int idx ,  List<List<Integer>> bg) {
    if(amt == 0 ) {
       bg.add(new ArrayList<>(ans));
        return ; 
    }
    for(int i=idx;i<coin.length;i++) {
        if(amt >= coin[i]) {
            ans.add(coin[i]);
            Com(coin , amt-coin[i] , ans, i , bg);
            ans.remove(ans.size() - 1);  
        }
    }
    }
}