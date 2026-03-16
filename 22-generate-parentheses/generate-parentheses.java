class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst=new ArrayList<>();
        generate(n,n, lst,"");
        return lst;
    }
    public void generate(int n_open, int n_close , List<String> lst, String ans){
        if( n_open ==0  && n_close == 0){
            lst.add(ans);
            return ;
        }
        if(n_open <0 || n_close < n_open){
            return;
        }

        generate(n_open-1 ,n_close, lst, ans+"(");
        generate(n_open ,n_close-1, lst, ans+")");
    }
}