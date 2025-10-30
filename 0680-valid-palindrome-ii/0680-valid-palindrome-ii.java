class Solution {
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return call(s,l+1,r) ||  call(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    public static boolean call(String s,int l,int r){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}