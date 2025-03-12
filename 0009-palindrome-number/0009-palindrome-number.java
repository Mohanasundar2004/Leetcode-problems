class Solution {
    public boolean isPalindrome(int x) {
        int a=x,i=0,j=0;
        if(x>=0){
            while(x>0){
                i=x%10;
                j=(j*10)+i;
                x=x/10;
            }
            if(a==j) return true;
        }
     return false;
    }
}