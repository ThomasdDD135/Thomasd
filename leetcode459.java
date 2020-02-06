class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String s2=s+s;
        return s2.substring(1,s2.length()-1).contains(s);
    }
}

/*
*/
