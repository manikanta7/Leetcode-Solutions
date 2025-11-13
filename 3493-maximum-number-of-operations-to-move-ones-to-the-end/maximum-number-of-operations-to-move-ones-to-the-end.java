class Solution {
    public int maxOperations(String s) { //greedy
        int one=0;
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                one++;   // Counting ones
            }
            else if(i>0 && s.charAt(i-1) == '1')
            {
                result+=one;  //if prefix is 1 then swap all the previous ones
            }
        }
        return result;
    }
}