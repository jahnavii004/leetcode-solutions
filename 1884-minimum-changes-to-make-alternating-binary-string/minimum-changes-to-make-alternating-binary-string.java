class Solution {
    public int minOperations(String s) {
        String pattern1="01";
        String pattern2="10";
        int count1=0,count2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != pattern1.charAt(i%2)){
                count1++;
            }
            if(s.charAt(i) != pattern2.charAt(i%2)){
                count2++;
            }
        }
        return Math.min(count1 ,count2);
    }
}