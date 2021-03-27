// Time: O(m*n)
// Space: O(m*n)
class Solution{
  public int uniquePaths(int m, int n) {
    if(m == 0 || n == 0 ) return 0;
    int[][] dp = new int[m][n];
    dp[0][0] = 0;
    for(int j=0;j<n;j++){
      dp[0][j] = 1;
    }
    for(int i=0;i<m;i++){
      dp[i][0] = 1;
    }
    
    for(int i=1;i<m;i++){
      for(int j=1;j<n;j++){
        dp[i][j] = dp[i-1][j] + dp[i][j-1];
      }
    }
    return dp[m-1][n-1];
  }
}




// Bruteforce :  recursion
/*class Solution {
  HashMap<Integer,Integer[]> map = new HashMap<>();
    public int uniquePaths(int m, int n) {
      if(m==0 || n== 0) return 0;
      int row = 0;
      int col = 0;
      return uniquePaths(row,col,m,n);
    }
  private int uniquePaths(int row,int col,int m,int n){
    if(row < 0 || col < 0 || row >= m || col >= n) return 0;
    if(row == m-1 || col == n-1) return 1;
    map.put(1,new Integer[]{1,2});
    return uniquePaths(row+1,col,m,n)+uniquePaths(row,col+1,m,n); 
  } 
}
*/
