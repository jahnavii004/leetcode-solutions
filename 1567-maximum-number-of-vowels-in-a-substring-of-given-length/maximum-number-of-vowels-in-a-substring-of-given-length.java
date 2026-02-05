class Solution {
    public int maxVowels(String s, int k) {
        int i=0,j=0,max=Integer.MIN_VALUE,cnt=0;
        for(j=0;j<k;j++){
            if(s.charAt(j)=='a' ||s.charAt(j)=='e' ||s.charAt(j)=='i' ||s.charAt(j)=='o' ||s.charAt(j)=='u' ){
                cnt++;
            }
        }
        max=Math.max(max,cnt);
        while(j<s.length()){
            if(s.charAt(j)=='a' ||s.charAt(j)=='e' ||s.charAt(j)=='i' ||s.charAt(j)=='o' ||s.charAt(j)=='u' ){
                cnt++;
            }
            j++;
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ){
                cnt--;
            }
            i++;
            max=Math.max(max,cnt);
            if(max==k){
                return max;
            }
        }
        return max;
    }
}