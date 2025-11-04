class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        if(n==0){
            return -1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    dfs(grid,i,j,2);
                }
            }
        }
        int min=2;
        for(int[] i:grid){
            for(int j:i){
                if(j==1){
                    return -1;
                }
                min=Math.max(min,j);
            }
        }
        return min-2;
    }
    public static void dfs(int [][]grid,int i,int j,int min){
        int n=grid.length,m=grid[0].length;
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]==0 || (grid[i][j]>1 && grid[i][j]<min)){
            return ;
        }
        else{
            grid[i][j]=min;
            dfs(grid,i-1,j,min+1);
            dfs(grid,i+1,j,min+1);
            dfs(grid,i,j-1,min+1);
            dfs(grid,i,j+1,min+1);
        }
    }
}