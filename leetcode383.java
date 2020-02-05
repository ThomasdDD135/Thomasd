class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length())
            return false;
        int[] num=new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            num[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            if(num[ransomNote.charAt(i)-'a']<=0)
                return false;
            num[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
}

/*开辟数组*/
