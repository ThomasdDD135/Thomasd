class Solution {
    public int countSegments(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if((i==0||s.charAt(i-1)==' ')&&s.charAt(i)!=' ')
                count++;
        }
        return count;
    }
}

/*
统计单词个数 
本身不是空格 前一个是空格*/
