class Solution {
    public int minOperations(String s) {
        String pattern1="01";
        int count1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != pattern1.charAt(i%2)){
                count1++;
            }
        }
        return Math.min(count1 ,s.length()-count1);
    }
}