class Solution {
    public int minBitFlips(int start, int goal) {
        int ans= start ^ goal;
        int cnt=0;
        // while(ans != 0){                // while(ans > 0){ cnt+= ans%2; ans/=2;}
        //     cnt++;
        //     ans= ans &(ans-1);
        // }
        while(ans >0){
            cnt+= ans %2;
            ans /=2;
        }
        return  cnt;
    }
}