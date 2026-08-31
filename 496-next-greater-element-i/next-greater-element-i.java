class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int n= nums2.length-1;
        int []arr=new int[nums1.length];

        for(int i=n;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i] , -1);
            }
            else{
                map.put(nums2[i] , st.peek());
            }
            st.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            arr[i] = map.get(nums1[i]);
        }

        return arr;
    }
}