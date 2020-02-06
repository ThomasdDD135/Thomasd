class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.charAt(0)>='A'&&word.charAt(0)<='Z')
            {
                int upCount=0;
                for(int j=1;j<word.length();j++)
                {
                    if(word.charAt(j)>='A'&&word.charAt(j)<='Z')
                    {
                        upCount++;
                    }
                
                }
                if(upCount==word.length()-1||upCount==0)
                    return true;
                else
                    return false;
            }
        else
        {
            int upCount=0;
            for(int j=1;j<word.length();j++)
                {
                    if(word.charAt(j)>='A'&&word.charAt(j)<='Z')
                    {
                        upCount++;
                    }
                }
                if(upCount==0)
                    return true;
                else
                    return false;
        }
    }
}
