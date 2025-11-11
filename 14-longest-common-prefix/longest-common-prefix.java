class Solution {
    public String longestCommonPrefix(String[] strs) {
        String preffix= strs[0];
        int preffix_length = preffix.length();
        for(int i=1;i<strs.length; i++)
        {
            String s = strs[i];
            while(preffix_length>s.length() || !preffix.equals(s.substring(0,preffix_length))) 
            {
                preffix_length--;
                if(preffix_length == 0)
                {
                    return "";
                }
                preffix= preffix.substring(0,preffix_length);
            }
        }
        return preffix;
    }
}