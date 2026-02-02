class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == '#' && (!s1.isEmpty())){
                s1.pop();
            }
            else if(ch!='#'){
                s1.push(ch);
            }
        }
        StringBuilder st1=new StringBuilder();StringBuilder st2=new StringBuilder();
        while(!s1.isEmpty()){
            st1.append(s1.pop());
        }
        s1.clear();
         for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ch == '#' && (!s1.isEmpty())){
                s1.pop();
            }
            else if(ch!='#'){
                s1.push(ch);
            }
        }
        while(!s1.isEmpty()){
            st2.append(s1.pop());
        }
       return st1.toString().equals(st2.toString());
    }
}