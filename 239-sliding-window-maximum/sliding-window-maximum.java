class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        return slidingwindow(nums,k);
    }
    public int[] slidingwindow(int []num,int k) {
		int [] ans=new int[num.length - k+1 ];
		Deque<Integer> dq=new ArrayDeque<>();
		int j=0;
		for(int i=0;i<k;i++){
			while(!dq.isEmpty() && num[dq.getLast()] < num[i]) {
				dq.removeLast();
			}
			dq.add(i);
		}
		ans[j++] = num[dq.getFirst()];
			
		for(int i=k;i<num.length;i++) {
			//grow
			while(!dq.isEmpty() && num[dq.getLast()] < num[i]) {
				dq.removeLast();
			}
			dq.add(i);
			
			//shrink
			if(dq.getFirst() == i-k) {
				dq.removeFirst();
			}
			
			//add first
			ans[j++] = num[dq.getFirst()];
		}
		return ans;
		}
}