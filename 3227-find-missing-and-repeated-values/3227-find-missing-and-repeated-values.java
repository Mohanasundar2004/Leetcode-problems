class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr=new int[2];
        int n=grid.length;
        int sum=n*n,m=0;
        int c=sum*(sum+1)/2;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(s.contains(grid[i][j])){
                    m=grid[i][j];
                }
                else{
                    s.add(grid[i][j]);
                    c-=grid[i][j];
                }
            }
        }
        arr[0]=m;
        arr[1]=c;
        return arr;
    }
} 