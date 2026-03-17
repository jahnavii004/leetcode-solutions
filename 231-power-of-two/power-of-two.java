class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        int m=n-1;
        if((m&n) == 0){
           return true; 
        }
        return false;
    }
}