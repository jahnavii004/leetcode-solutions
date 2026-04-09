class Solution {
    public String smallestNumber(String str) {
        Stack<Integer> st=new Stack<>();
        int c=1;
        int [ ]arr=new int[str.length()+1];
        for(int i=0;i<=str.length();i++){
            if(i == str.length() || str.charAt(i) == 'I'){
                arr[i]=c++;
                while(!st.isEmpty()){
                    arr[st.pop()]=c++;
                }
            } else{
                st.push(i);
            }
        }
        String s="";
	        for(int x:arr) {
	        	s=s+x;
	        }
        return s;
    }
}