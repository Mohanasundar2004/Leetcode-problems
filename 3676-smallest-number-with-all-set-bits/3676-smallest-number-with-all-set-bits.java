class Solution {
    public int smallestNumber(int n) {
        int sum=0;
        List<Integer>l=new ArrayList<>();
        while(n>0){
            l.add(n%2);
            n/=2;
        }
        Collections.reverse(l);
        for(int k=0;k<l.size();k++){
            sum+=Math.pow(2,k);
        }
        // System.out.println(l);
        return sum;
    }
}