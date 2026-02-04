class Solution {
    String []key= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> lst=new ArrayList<>();
        Keypaid(digits,"",lst);
        return lst;
    }
    public void Keypaid(String ques, String ans , List<String> lst) {
		if(ques.length()==0) {
			lst.add(ans);
			return;
		}
		char ch = ques.charAt(0); //'2'
		String get=key[ch-'0']; //2 -> abc
		for(int i=0;i<get.length();i++) {
			Keypaid(ques.substring(1),ans+get.charAt(i),lst);
		}
}
}