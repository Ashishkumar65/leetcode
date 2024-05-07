
/*https://leetcode.com/problems/string-to-integer-atoi/
*/


class Solution {
    public int myAtoi(String s) {
       int n = s.length();
       int ans = 0;
       if(n == 0){
        return 0;
       }

       int i =0, sign = 1;
       int max = Integer.MAX_VALUE;
       int min = Integer.MIN_VALUE;

    while(i < n && s.charAt(i) == ' '){
        i++;
    }
    if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')){
        if(s.charAt(i) == '-'){
            sign = -1;
        }
        i++;
    }
    while(i < n && s.charAt(i) - '0' <= 9 && s.charAt(i)-'0' >= 0){
        int val = s.charAt(i) -'0';
        if( ans > max/10 || (ans == max/10 && val > max%10)){
            return (sign == 1) ? max :min;
        }
        ans = ans*10+val;
        i++;
    }
    return ans*sign;

    }
}
