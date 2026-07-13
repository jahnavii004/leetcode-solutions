class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> lst=new ArrayList<>();
        if(s.length()<10){
            return lst;
        }
        int i=0;
        HashSet<String> set=new HashSet<>();
        HashSet<String> st=new HashSet<>();
        StringBuilder str=new StringBuilder();
        for(int j=0;j<10;j++){
            str.append(s.charAt(j));
        }
        set.add(str.toString());
        int j=10;
        while(j<s.length()){
            //grow
            str.append(s.charAt(j));
            j++;
            //shrink
            str.deleteCharAt(0);
            i++;
            //ans
            if(set.contains(str.toString())){
                st.add(str.toString());
            }
            else{
                set.add(str.toString());
            }
        }
       lst.addAll(st);
        return lst;
    }
}