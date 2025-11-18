class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        boolean rowpointer=false;
        boolean columnpointer=false;

        for(int i=0;i<row;i++)
        {
            if(matrix[i][0] == 0)
            {
                rowpointer=true;
                break;
            }
        }
        for(int i=0;i<column;i++)
        {
            if(matrix[0][i] == 0)
            {
                columnpointer=true;
                break;
            }
        }
        for(int i=0;i<row;i++)
        {
            int j=0;
            while(j<column)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0] = matrix[0][j] = 0;
                }
                j++;
            }
        }
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<column;j++)
            {
                if(matrix[i][0] == 0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        if(rowpointer==true)
        {
            for(int i=0;i<row;i++)
            {
                matrix[i][0]=0;
            }
        }
        if(columnpointer==true)
        {
            for(int i=0;i<column;i++)
            {
                matrix[0][i]=0;
            }
        }
    }
}