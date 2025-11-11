class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length())
        {
            return s;
        }
        int row = 0;
        int column = 1;
        int i=0;
        List<Character>[] rows = new ArrayList[numRows];
        for(i=0;i<numRows;i++)
        {
            rows[i] = new ArrayList<>();
        }
        for(char c : s.toCharArray())
        {
            rows[row].add(c);
            if(row ==0)
            {
                column  = 1;
            }
            else if(row == numRows-1)
            {
                column = -1;
            }
            row+=column;
        }
        StringBuilder sb= new StringBuilder();
        for(List<Character> eachrow : rows)
        {
            for(char c: eachrow){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}