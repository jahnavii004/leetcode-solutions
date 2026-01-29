class Solution {
    public boolean isPowerOfTwo(int n) {
        return Power(n,0);
    }
    public boolean Power(int n , int i){
        if(Math.pow(2,i)> n){
            return false;
        }
        if(Math.pow(2,i)==n){
            return true;
        }
        return Power(n,i+1);
    }
}