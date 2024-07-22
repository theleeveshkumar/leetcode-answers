class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while (left < nums.length) {
            if (nums[left] != 0) {
                nums[right] = nums[left];
                right++;
            }
            left++;
        }
        while (right < nums.length) {
            nums[right] = 0;
            right++;
        }
    }
}