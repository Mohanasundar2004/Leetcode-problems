class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        List<Character>l=new ArrayList<>();
         List<Character>li=new ArrayList<>();
        for(char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                l.add(i);
                li.add(i);
            }
        }
        Collections.reverse(l);
        System.out.println(l);
        System.out.println(li);
        int n=l.size();
        for(int i=0;i<n;i++){
            if(l.get(i)!=li.get(i)){
                return false;
            }
        }
        return true;
    }
}