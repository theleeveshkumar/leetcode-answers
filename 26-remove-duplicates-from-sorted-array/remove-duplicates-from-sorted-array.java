class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int[] arr2 = new int[nums.length];
        arr2[0] = nums[0];
        int j = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                arr2[j] = nums[i];
                j++;
            }
        }
        for (int k = 0; k < j; k++) {
            nums[k] = arr2[k];
        }
        
        return j;
    }
}
