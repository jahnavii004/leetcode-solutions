class Solution {
    public String minWindow(String s, String t) {
       int[]hash = new int[128];
        int cnt=0;

        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            hash[ch]++;
        }

        char[]str =s.toCharArray();
        int n= str.length; int m= t.length();
        int min= Integer.MAX_VALUE;

        int l=0, r= 0;
        int sIndex = -1;
         
        while(r< n){
            if(hash[str[r]] > 0){
                cnt++;
            }
            hash[str[r]]--;
            
            while(cnt == m){
                if((r-l+1) < min){
                    min=r-l+1;
                    sIndex= l;
                }

                hash[str[l]]++;
                if(hash[str[l]] > 0){
                    cnt--;
                }
                l++;
            }
            r++;
        }
        

        return sIndex == -1 ? "" : s.substring(sIndex , min+sIndex);
    }
}