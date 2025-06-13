class Solution {
public:
    int minimizeMax(vector<int>& nums, int p) {
        sort(nums.begin(), nums.end());

        int low = 0, high = nums.back() - nums.front();

        auto canFormPairs = [&](int maxDiff) {
            int count = 0;
            for (int i = 1; i < nums.size(); ) {
                if (nums[i] - nums[i - 1] <= maxDiff) {
                    count++;
                    i += 2;
                } else {
                    i += 1;
                }
            }
            return count >= p;
        };

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canFormPairs(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
};