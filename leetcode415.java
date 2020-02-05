class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        StringBuffer sb=new StringBuffer();
        for(;i>=0||j>=0;i--,j--)
        {
            int a=(i>=0)?(num1.charAt(i)-'0'):0;
            int b=(j>=0)?(num2.charAt(j)-'0'):0;
            int sum=a+b+carry;
            sb.append(sum%10);
            carry=sum/10;
        }
        if(carry>0)
            sb.append(1);
        return sb.reverse().toString();
    }
}

/*
倒叙相加
注意进位
*/
