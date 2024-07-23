class Solution {
    public int reverse(int x) {
        int revN = 0;
        while (x != 0) {
            int lastdigit = x % 10;
            x = x / 10;
            if (revN > Integer.MAX_VALUE / 10 || (revN == Integer.MAX_VALUE / 10 && lastdigit > 7)) return 0;
            if (revN < Integer.MIN_VALUE / 10 || (revN == Integer.MIN_VALUE / 10 && lastdigit < -8)) return 0;
            
            revN = (revN * 10) + lastdigit;
        }
        return revN;
    }
}
