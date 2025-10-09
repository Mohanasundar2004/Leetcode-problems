class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length(),m=goal.length();
        if(n!=m){
            return false;
        }
        // int a=0;
        // for(int i=1;i<n-1;i++){
        //     if(s.charAt(0)==goal.charAt(i) && s.charAt(1)==goal.charAt(i+1)  && s.charAt(n-1)==goal.charAt(i-1)){
        //         a=i;
        //         System.out.println(a+" "+goal.charAt(i)+" "+goal.charAt(i-1));
        //         break;
        //     }
        // }
        // for(int i=a;i<n+a;i++){
        //     if(s.charAt(i-a)!=goal.charAt(i%n)){
        //         return false;
        //     }
        // }
        // return true;
        return (s+s).contains(goal);
    }
}