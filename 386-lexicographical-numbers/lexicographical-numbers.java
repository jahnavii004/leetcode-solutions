class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> lst=new ArrayList<>();
        lexi(0,n,lst);
        return lst;
    }
    public void lexi(int curr,int n,List<Integer> lst ) {
		if(curr>n) {
			return;
		}
        if(curr!=0){
            lst.add(curr);
        }
		int i=0;
		if(curr ==0) {
			i=1;
		}
		for(;i<=9;i++) {
			lexi(curr*10+i , n ,lst);
		}
	}
}