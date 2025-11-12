class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        int i=0;
        int j = str.length-1;  // str is array of strings

        while(i<j)
        {
            String temp = str[i]; // left and right pointers to reverse the string array
            str[i]=str[j];
            str[j] = temp;
            i++;
            j--;
        }

        StringBuilder sb = new StringBuilder();
        for(String str1:str) {  // building string from string array 
            if(!str1.isEmpty()) {
                if (sb.length() > 0) { // appending null string before appending the original string to make sure if the string is NULL
                    sb.append(" ");
                }
                sb.append(str1);
            }
        }
        return sb.toString();
    }
}