class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revN = 0;
        while (x > revN) {
            int lastdigit = x % 10;
            x = x / 10;
            revN = (revN * 10) + lastdigit;
        }
        return x == revN || x == revN / 10;
    }
}