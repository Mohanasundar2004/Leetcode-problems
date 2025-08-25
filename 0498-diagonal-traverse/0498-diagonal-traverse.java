class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int[] arr=new int[n*m];
        int x=0,y=0;
        for(int i=0;i<n*m;i++){
            arr[i]=mat[x][y];
            if((x+y)%2==0){
                if(y==m-1){
                    x++;
                }
                else if(x==0){
                    y++;
                }
                else{
                    x--;
                    y++;
                }
            }
            else{
                if(x==n-1){
                    y++;
                }
                else if(y==0){
                    x++;
                }
                else{
                    x++;
                    y--;
                }
            }
        }
        return arr;
    }
}