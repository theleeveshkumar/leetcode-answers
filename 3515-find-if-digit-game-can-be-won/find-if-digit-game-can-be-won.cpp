class Solution {
public:
    bool canAliceWin(vector<int>& nums) {
        int sumSingle = 0;
        int sumDouble = 0;

        for (int num : nums) {
            if (num < 10) {
                sumSingle += num;
            } else {
                sumDouble += num;
            }
        }
        if (sumSingle > sumDouble) return true;
        if (sumDouble > sumSingle) return true;
        return false;
    }
};
