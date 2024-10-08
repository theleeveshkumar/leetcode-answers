class Solution {
    public int minSwaps(String s) {
        int balance = 0;
        int unbalanced = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                unbalanced++;
                balance = 0;
            }
        }
        return (unbalanced + 1) / 2;
    }
}
