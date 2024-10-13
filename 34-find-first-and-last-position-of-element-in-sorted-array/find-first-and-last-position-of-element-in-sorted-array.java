class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Binary Search 
        int n=nums.length;
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>=target)
            {
                if(nums[mid]==target){
                first=mid;}
                high=mid-1;
            }
           else
           {
            low=mid+1;
           }
        }
        int low1=0;
        int high1=n-1;
        int end=-1;
        while(low1<=high1)
        {
            int mid1=low1+(high1-low1)/2;
            if(nums[mid1] > target)
            {
                high1=mid1-1;
            }
            else
            {
                if(nums[mid1]==target){
                end=mid1;}
              low1=mid1+1;  
            }
        }
        return new int[]{first,end};
    }
}