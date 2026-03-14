class Solution {
    static int Int_min=-2147483648;
    static int Int_max=2147483647;
    public int myAtoi(String s) {
        int i=0;
       while(i<s.length() && s.charAt(i)== ' '){
        i++;
       }
       int sign=1;
       if(i<s.length() && (s.charAt(i)== '+' || s.charAt(i) == '-')){
        sign = (s.charAt(i) == '-') ? -1 : 1;
        i++;
       }
       return change(s,i,0,sign);
    }
    public int change(String s, int i, int num, int sign){
        if(i>= s.length() || !Character.isDigit(s.charAt(i)) ){
            return (int)num*sign;
        }
         int digit = s.charAt(i) - '0';

        if (num > (Int_max - digit) / 10) {
            return sign == 1 ? Int_max : Int_min;
        }
        num=num*10 + digit;
         return change(s,i+1 , num , sign);
    }
}