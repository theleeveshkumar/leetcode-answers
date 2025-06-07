class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int rows = matrix.size();
        if (rows == 0) return false;
        int cols = matrix[0].size();

        int leftElement = 0, rightElement = rows * cols - 1;

        while (leftElement <= rightElement) {
            int middleElement = leftElement + (rightElement - leftElement) / 2;
            int middleElement_val = matrix[middleElement / cols][middleElement % cols];

            if (middleElement_val == target) {
                return true;
            } else if (middleElement_val < target) {
                leftElement = middleElement + 1;
            } else {
                rightElement = middleElement - 1;
            }
        }
        return false;
    }
};
