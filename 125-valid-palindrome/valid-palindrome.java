class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder temp = new StringBuilder();
        // for(int i=0;i<s.length();i++)
        // {
        //     char c=s.charAt(i);
        //     if('a'<=c && c<='z') temp.append(c);
        //     else if('A'<=c && c<='Z') temp.append((char)c+32);
        //     else if('0'<=c && c<='9') temp.append(c);
        // }
        // int n=temp.length();
        // for(int i=0;i<n/2;i++)
        // {
        //     if(temp.charAt(i)!=temp.charAt(n-i-1)) return false;
        // }
        // return true;

        
        // s = s.toLowerCase().replaceAll("[^a-z0-9]","");   // using predefined functions


        // for(int i =0;i<s.length()/2;i++){
        //     if(s.charAt(i)!=s.charAt(s.length()-i-1)){
        //         return false;
        //     }
        // }
        // return true;

        //Using two pointers
        int start =0;
        int end = s.length()-1;
        while(start<=end)
        {
            char c1=s.charAt(start);
            char c2=s.charAt(end);
            if('A'<=c1 && c1<='Z') c1=(char)(c1+32);
            if('A'<=c2 && c2<='Z') c2=(char)(c2+32);

            if(!(('a'<=c1 && c1<='z') || '0'<=c1 && c1<='9')) {
                start++;
                continue;
            }
            if(!(('a'<=c2 && c2<='z') || '0'<=c2 && c2<='9')) {
                end--;
                continue;
            }
            if(c1!=c2) return false;
            start++;
            end--;
        }
        return true;
    }
}