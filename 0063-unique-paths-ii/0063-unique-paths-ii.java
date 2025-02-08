class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        if(grid[0][0]==1 || grid[r-1][c-1]==1){
            return 0;
        }
        int[][] arr=new int[r][c];
        arr[0][0]=1;
        for(int i=1;i<r;i++){
            if(grid[i][0]==1){
                arr[i][0]=0;
            }
            else{
                arr[i][0]=arr[i-1][0];
            }
        }
        for(int i=1;i<c;i++){
            if(grid[0][i]==1){
                arr[0][i]=0;
            }
            else{
                arr[0][i]=arr[0][i-1];
            }
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(grid[i][j]==1){
                    arr[i][j]=0;
                }
                else{
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];
                }
            }
        }
        return arr[r-1][c-1];
    }
}