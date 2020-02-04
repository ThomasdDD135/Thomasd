class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> arrayList=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
            {
                arrayList.add((char) (s.charAt(i)+32));
            }
            else if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                arrayList.add(s.charAt(i));
            }
            else
                continue;
        }
        for (int i = 0; i < arrayList.size()/2; i++) {
            if(arrayList.get(i)!=arrayList.get(arrayList.size()-i-1))
                return false;
        }
        return true;
    }
}
/*
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

说明：本题中，我们将空字符串定义为有效的回文串。

示例 1:

输入: "A man, a plan, a canal: Panama"
输出: true
示例 2:

输入: "race a car"
输出: false

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/valid-palindrome
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/
