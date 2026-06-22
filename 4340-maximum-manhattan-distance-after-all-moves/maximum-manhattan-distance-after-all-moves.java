class Solution {
    public int maxDistance(String moves) {
        int []arr= {0,0};int cnt=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch == 'U'){
                arr[1]++;
            }
            else if(ch == 'D'){
                arr[1]--;
            }
            else if(ch == 'L'){
                arr[0]--;
            }
            else if(ch == 'R'){
                arr[0]++;
            }
            else {
                cnt++;
            }
        }
        int dis = Math.abs(arr[0])+Math.abs(arr[1]);
        return dis + cnt;
    }
}