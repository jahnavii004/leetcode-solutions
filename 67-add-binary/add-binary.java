class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder sb=new StringBuilder();
        int carry=0,res=0;
        while(i>=0 || j>=0 || carry==1){
            int sum=carry;
            if(i>=0){
                sum+=(a.charAt(i)-'0');
                i--;
            }
            if(j>=0){
                 sum+=(b.charAt(j)-'0');
                 j--;
            }
            res=sum%2;
            carry=sum/2;
            sb.append(res);
        }
        sb.reverse();
        return sb.toString();
    }
}