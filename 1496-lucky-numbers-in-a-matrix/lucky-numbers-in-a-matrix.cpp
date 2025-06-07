class Solution {
public:
    vector<int> luckyNumbers(vector<vector<int>>& matrix) {
        int rows = matrix.size();
        int cols = matrix[0].size();

        vector<int> rowMins(rows);
        vector<int> colMaxs(cols, INT_MIN);
    // for rows - mimimum 3,9,15
        for (int i = 0; i < rows; ++i) {
            int numberDesired = matrix[i][0];
            for (int j = 1; j < cols; ++j) {
                numberDesired = min(numberDesired, matrix[i][j]);
            }
            rowMins[i] = numberDesired;
        }
    // for colunumberDesireds - maximum 15,16,17
        for (int j = 0; j < cols; ++j) {
            for (int i = 0; i < rows; ++i) {
                colMaxs[j] = max(colMaxs[j], matrix[i][j]);
            }
        }
    // for lucky number 
        vector<int> result;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (matrix[i][j] == rowMins[i] && matrix[i][j] == colMaxs[j]) {
                    result.push_back(matrix[i][j]);
                }
            }
        }

        return result;
    }
};
