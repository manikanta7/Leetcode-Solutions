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
        if(s.isEmpty())
        {
            return true;
        }
        int start =0;
        int end = s.length()-1;
        while(start<=end)
        {
            char c1=s.charAt(start);
            char c2=s.charAt(end);

            while(!Character.isLetterOrDigit(s.charAt(start)) && start<end){
                start++;
                
            }
            while(!Character.isLetterOrDigit(s.charAt(end)) && start<end) {
                end--;
            }
            if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))) return false;
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}