class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        long num=0;
        int mul = 1;
        while(n>0){
            long rem=n%10;
            if(rem == 0){
                n/=10;
                continue;
            }
            num = rem * mul + num;
            sum += rem;
            mul *=10;
            n/=10;
        }
        return num * sum;
    }
}