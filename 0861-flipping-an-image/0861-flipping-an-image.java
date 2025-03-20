class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length,m=image[0].length,k=0;
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            k=0;
            for(int j=m-1;j>=0;j--){
                arr[i][k++]=image[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    arr[i][j]=0;
                }
                else{
                    arr[i][j]=1;
                }
            }
        }
        return arr;
    }
}