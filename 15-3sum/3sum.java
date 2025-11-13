class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-2)
        {
            if (i > 0 && nums[i] == nums[i - 1]){
                i++;
                continue;
            }
            if(nums[i]>0) break;
            int j=i+1;
            int z=nums.length-1;
            int target = -nums[i];
            while(j<z)
            {
                if(nums[j]+nums[z]==target)
                {
                    listOfLists.add(Arrays.asList(nums[i], nums[j], nums[z]));
                    j++;
                    z--;
                    while (j < z && nums[j] == nums[j - 1]) j++;
                    while (j < z && nums[z] == nums[z + 1]) z--;
                }
                else if (nums[j]+nums[z] < target) j++;
                else z--;
            }
            i++;
        }
        return listOfLists;
    }
}