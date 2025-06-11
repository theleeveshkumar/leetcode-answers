class Solution {
public:
    int differenceOfSums(int n, int m) {
        int positiveSum = 0;
        int negativeSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                negativeSum += i;
            } else {
                positiveSum += i;
            }
        }
        return positiveSum - negativeSum;
    }
};