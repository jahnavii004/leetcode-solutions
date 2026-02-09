class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,j=people.length-1;
        int sum=0,cnt=0;
        while(i<=j){
            if(people[j]==limit){
                j--;
                cnt++;
            }
            else if(people[j]+people[i] <=limit){
                j--;i++;
                cnt++;
            }
            else if(people[j]<=limit){
                j--;
                cnt++;
            }
            else if(people[i]<=limit){
                i++;
                cnt++;
            }
        }
        return cnt;
    }
}