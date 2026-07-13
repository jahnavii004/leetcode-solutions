class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> lst=new ArrayList<>();
        for(int i=1;i<=9;i++){
            seq(low, high, i,lst);
        }
        Collections.sort(lst);
        return lst;
    }
    public void seq(int low, int high, int num, List<Integer> lst){
        if(num >= low && num <= high){
            lst.add(num);
        }
        if(num >= high){
            return;
        }
        int last = num %10;
        if(last == 9){
            return;
        }
        seq(low, high , num*10 + (last+1) , lst);
    }
}