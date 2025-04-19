class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long count=0;
         Arrays.sort(nums);
        long c1 = 0;
        long c2 = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] <= upper) {
                c1 += (j - i);
                i++;
            } else {
                j--;
            }
        }
        i = 0;
        j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] < lower) {
                c2 += (j - i);
                i++;
            } else {
                j--;
            }
        }
        return c1 - c2;
    }
}