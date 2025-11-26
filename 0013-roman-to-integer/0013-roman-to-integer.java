class Solution {
    public int romanToInt(String s) {
        int i=0,a=0,b=0;
        for(i= s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            switch(c){
                case 'I':a=1;break;
                case 'V':a=5;break;
                case 'X':a=10;break;
                case 'L':a=50;break;
                case 'C':a=100;break;
                case 'D':a=500;break;
                case 'M':a=1000;break;

            }
            if(3*a<b)b-=a;
            else b+=a;
        }
        return b;
    }

}