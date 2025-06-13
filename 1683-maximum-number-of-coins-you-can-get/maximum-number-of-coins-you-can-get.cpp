class Solution {
public:
    int maxCoins(vector<int>& piles) {
        sort(piles.begin(), piles.end());
        int result = 0;
        int n = piles.size() / 3;
        int end = piles.size() - 2;
        for (int i = 0; i < n; ++i) {
            result += piles[end];
            end -= 2;
        }
        return result;
    }
};
