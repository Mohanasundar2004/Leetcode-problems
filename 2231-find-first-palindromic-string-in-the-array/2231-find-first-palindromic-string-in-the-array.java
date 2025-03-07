class Solution {
    public String firstPalindrome(String[] words) {
        for(String s : words){
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            String m=sb.toString();
            if(s.equals(m)){
                return s;
            }
        }
        return "";
    }
}