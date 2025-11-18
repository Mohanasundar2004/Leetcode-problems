class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length,c=0;
        for(int i=n-2;i>=0 && bits[i]!=0;i--){
            // System.out.println(bits[i]+" "+i);
            c++;
        }
        return c%2==0;
    }
}