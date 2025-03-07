class Solution {
    public int countDigits(int num) {
        int count=0,a=num;
        while(a>0){
            int b=a%10;
            a/=10;
            if( num%b==0){
                count++;
            }
        }
        return count;
    }
}