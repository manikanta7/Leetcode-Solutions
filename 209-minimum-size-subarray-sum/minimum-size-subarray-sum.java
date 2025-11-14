class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
            while(sum>=target) // first step
            {
                if(i-left+1<n){
                    n = i-left+1;
                }
                sum = sum - nums[left];
                left++;
            }
        }
        return n != Integer.MAX_VALUE ? n : 0;
    }
}