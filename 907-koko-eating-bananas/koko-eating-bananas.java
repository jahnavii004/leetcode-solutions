class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(hours(piles,h , mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean hours(int []piles , int h , int mid){
        int hour=0;
        for(int i=0;i<piles.length;i++){
           hour+=Math.ceil((double)piles[i]/(double)mid);
        }
        if(hour<=h){
            return true;
        }
        return false;
    }
    public int max(int []piles){
        int maxi=Integer.MAX_VALUE;
        for(int i:piles){
            Math.max(maxi,i);
        }
        return maxi;
    }
}