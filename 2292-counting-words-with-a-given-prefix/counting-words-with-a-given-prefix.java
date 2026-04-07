class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt=0;
       Arrays.sort(words);
       for(int i=0;i<words.length;i++){
        if(words[i].charAt(0)> pref.charAt(0)){
            break;
        }
        else if(words[i].startsWith(pref)){
            cnt++;
        }
       }
       return cnt;
    }

}