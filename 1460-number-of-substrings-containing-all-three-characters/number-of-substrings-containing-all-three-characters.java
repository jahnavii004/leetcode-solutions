class Solution {
    public int numberOfSubstrings(String s) {
        int cnt=0;int valid=0;
        int lastSeen_a=-1,lastSeen_b=-1,lastSeen_c=-1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a'){
                lastSeen_a = i;
            }
            else if(ch == 'b'){
                lastSeen_b = i;
            }
           else if(ch == 'c'){
                lastSeen_c = i;
            }
            valid= Math.min(lastSeen_a, Math.min(lastSeen_b,lastSeen_c))+1;
            cnt+=valid;
        }
        return cnt;
    }
}