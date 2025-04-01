class Solution {
    public String convertToBase7(int a) {
        if(a==0){
            return "0";
        }
        String s="";
        
        int num=Math.abs(a);
        while(num>0){
            s+=String.valueOf(num%7);
            num/=7;
        }
        if(a<0){
            s+="-";
           
        }
         StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            s=sb.toString();
        return s;
    }
}