class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> bg=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        find(n ,k ,1, lst,bg);
        return bg;
    }
    public void find(int n,int k ,int num, List<Integer> lst,List<List<Integer>> bg){
        if(lst.size() == k){
            bg.add(new ArrayList<>(lst));
            return;
        }
        for(int i=num ;i<=n;i++){
            lst.add(i);
            find(n,k,i+1,lst,bg);
            lst.remove(lst.size()-1);
        }
    }
}