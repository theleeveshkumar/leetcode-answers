class Solution {
    public int countOdds(int low, int high) {

      if(low%2==0 && high%2==0)
      {
          return (high-low)/2;
      }
      else if(low%2!=0 && high%2==0)
      {
          int a= (high-low)/2;
          return a+1;
      }
      else if(low%2==0  && high%2!=0)
      {
          int a=(high-low)/2;
          return a+1;
      }
      else
      {
          int b=(high-low)/2;
          return b+1;
      }  
    }
}