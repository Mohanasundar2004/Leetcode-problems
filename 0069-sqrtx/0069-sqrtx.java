class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int c=0,l=0,r=x;
        while(l<=r){
            int mid=l+(r-l)/2;
            if((long)mid*mid<(long)x){
                l=mid+1;
            }
            else if(mid*mid==x){
                return mid;
            }
            else{
                r=mid-1;
            }
        }
        return (int)r;
    }
}