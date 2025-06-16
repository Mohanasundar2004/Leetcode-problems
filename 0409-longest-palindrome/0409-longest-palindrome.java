class Solution {
    public int longestPalindrome(String s) {
        int a=0;
        boolean has=false;
        int[] arr=new int[256];
        for(char c:s.toCharArray()){
            arr[c]++;
        }
        for(int i:arr){
            a+=(i/2)*2;
            if(i%2==1){
                has=true;
            }
        }
        return has?a+1:a;
    }
}