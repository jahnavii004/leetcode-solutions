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
        String st1="",st2="";
        while(!s1.isEmpty()){
            st1+=s1.pop();
        }
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
            st2+=s1.pop();
        }
        if(st1.equals(st2)){
            return true;
        }
        return false;
    }
}