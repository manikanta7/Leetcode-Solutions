class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        int one =0;

        for(int i : nums) if (i == 1) one++; // count number of ones in the array
        if(one>0) return n-one; // of there are ones then gcd will be one definitely , return elements that are not ones

        int current_gcd=0;
        for(int i:nums) current_gcd=gcd(current_gcd,i);
        if(current_gcd>1) return -1;  // if gcd is greater than 1, then elements are multiples of some number

        int x = n;
        for(int i=0;i<n;i++)
        {
            current_gcd=0;
            for(int j=i;j<n;j++)
            {
                current_gcd = gcd(current_gcd, nums[j]);
                if(current_gcd == 1)
                {
                    x = Math.min(x,j-i);
                    break;
                }
            }
        }
        return x + (n - 1);
    }
    public int gcd(int m, int n)
    {
        if(n==0) return m;
        else{
            return gcd(n,m%n);
        }
    }
}