class Solution {
    public int numSquares(int n) {
        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        for(int i = 2; i<=n; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 1; j*j<=i; j++){
                int k = i - j*j;
                if(array[k]<min){
                    min = array[k];
                }
            }
            array[i] = min+1;
        }
        return array[n];
    }
}