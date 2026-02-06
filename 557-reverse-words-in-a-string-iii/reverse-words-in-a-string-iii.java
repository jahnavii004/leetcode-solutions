class Solution {
    public String reverseWords(String s) {
       int j=s.length()-1;
      String sb="";
       while(j>=0){
        StringBuilder su=new StringBuilder();
        while(s.charAt(j)!=' ' && j!=0){
            su.append(s.charAt(j));
            j--;
        }
        if(j==0){
            su.append(s.charAt(j));
        }
        su.append(" ");
        j--;
        sb=su.toString()+sb;
       }
       return sb.trim(); 
    }
}