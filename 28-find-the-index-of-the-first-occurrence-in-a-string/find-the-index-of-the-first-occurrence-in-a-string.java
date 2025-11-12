class Solution {
    public int strStr(String haystack, String needle) {
        for(int j=0; j<=(haystack.length()-needle.length());j++)
        {
            if(haystack.substring(j,j+needle.length()).equals(needle)){
                return j;
            }
        }
        return -1;
    }
}