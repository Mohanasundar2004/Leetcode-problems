class Solution {
    public String clearDigits(String s) {
       StringBuilder sb=new StringBuilder(s);
       for(int i=0;i<sb.length();i++){
            int n=sb.charAt(i)-'0';
            if(n>=0 && n<=9){
                sb=sb.delete(i-1,i+1);
                i-=2;
            }
       } 
       return sb.toString();
    }
}