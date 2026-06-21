class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt=0,sum=0;
        for(int i=0;i<costs.length;i++){
            if(sum + costs[i] <= coins){
                cnt++;
                sum+=costs[i];
            }
            else{
                break;
            }
        }
        return cnt;
    }
}