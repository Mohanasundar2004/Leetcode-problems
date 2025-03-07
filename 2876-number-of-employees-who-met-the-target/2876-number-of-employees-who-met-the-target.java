class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int a : hours){
            if(a>=target){
                c++;
            }
        }
        return c;
    }
}