class Solution {
    public int majorityElement(int[] nums) {
        int maxCount = 0;
        int maxNum = 0;
        for(int num : nums) {
            if(maxCount == 0) {
                maxNum = num;
                maxCount = 1;
            } else if(num == maxNum) {
                maxCount++;
            } else {
                maxCount--;
            }
        }
        return maxNum;
    }
}
