class Solution {
    public int totalMoney(int n) {
        int sum=0,c=1,m=0;
        while(n>0){
            sum+=c;
            c++;
            m++;
            if(m==7){
                c-=6;
                m=0;
            }
            n--;
        }
        return sum;
    }
}