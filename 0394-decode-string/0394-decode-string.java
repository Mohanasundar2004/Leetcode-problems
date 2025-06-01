class Solution {
    public String decodeString(String s) {
        Stack<Integer>st=new Stack<>();
        Stack<StringBuilder> sb1=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int a=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                a=(a*10)+(c-'0');
            }
            else if(c=='['){
                st.push(a);
                a=0;
                sb1.push(sb);
                sb=new StringBuilder();
            }
            else if(c==']'){
                int q=st.pop();
                StringBuilder t=sb;
                sb=sb1.pop();
                for(int i=0;i<q;i++){
                    sb.append(t);
                } 
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}