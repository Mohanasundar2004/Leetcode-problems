class Solution {
    public int minimumMoves(String s) {
        int c=0,i=0,n=s.length();
        while(i<n){
            if(s.charAt(i)=='X'){
                i+=3;
                c++;
            }
            else{
                i++;
            }
        }
        return c;
    }
}