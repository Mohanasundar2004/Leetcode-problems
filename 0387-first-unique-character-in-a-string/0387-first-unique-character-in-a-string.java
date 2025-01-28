class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            arr[c-'a']++;
        }
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(arr[c-'a']==1){
                return i;
            }
        }
        return -1;
    }
}