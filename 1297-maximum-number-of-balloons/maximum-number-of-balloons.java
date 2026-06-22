class Solution {
    public int maxNumberOfBalloons(String text) {
       int[]arr=new int[26];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            arr[ch-'a']++;
        }
        return Math.min(arr['b'-'a'],Math.min(arr['a'-'a'],Math.min(arr['l'-'a']/2,Math.min(arr['o'-'a']/2,arr['n'-'a']))));
    }
}