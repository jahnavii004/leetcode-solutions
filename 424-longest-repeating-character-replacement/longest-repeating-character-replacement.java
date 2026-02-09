class Solution {
    public int characterReplacement(String s, int k) {
        int max=Integer.MIN_VALUE ;
        for(char ch='A'; ch<='Z'; ch++){
            int i=0,j=0, rep=0;
            while(j<s.length()){
                if(s.charAt(j) == ch){
                    j++;
                }
                else if( s.charAt(j) != ch){
                    rep++;
                    j++;
                }
                if(rep > k){
                    if(s.charAt(i) == ch){
                        i++;
                    }
                    else{
                        i++;
                        rep--;
                    }
                }
                max=Math.max(max,j-i);
            }
        }
        return max;
    }
}