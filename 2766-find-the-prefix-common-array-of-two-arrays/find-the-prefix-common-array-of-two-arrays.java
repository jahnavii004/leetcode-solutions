class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> setB=new HashSet<>();
        int []c=new int[A.length];
        if(A[0] == B[0]){
            c[0]=1;
        }
        setB.add(B[0]);
        int cnt=0;
        for(int i=1;i<A.length;i++){
            setB.add(B[i]);
            cnt=0;
            for(int j=0;j<=i;j++){
                if(setB.contains(A[j])){
                    cnt++;
                }
                c[i]=cnt;
            }
        }
        return c;
    }
}