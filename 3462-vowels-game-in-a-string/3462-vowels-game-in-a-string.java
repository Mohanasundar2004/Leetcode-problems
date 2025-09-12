class Solution {
    public boolean doesAliceWin(String s) {
        String st="aeiou";
        for(int i=0;i<s.length();i++){
            if(st.indexOf(s.charAt(i))!=-1){
                return true;
            }
        }
        return false;
    }
}