class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        List<Character>l=new ArrayList<>();
        for(char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                l.add(i);
            }
        }
        int li=0,r=l.size()-1;
        while(li<=r){
            if(l.get(li)!=l.get(r)){
                return false;
            }
            li++;
            r--;
        }
        return true;
    }
}